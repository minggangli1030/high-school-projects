package com.controller;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.hash.HashUtil;
import com.model.DBUtil;

@WebServlet("/signup")
@MultipartConfig

public class UserSignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserSignupServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext servletContext = request.getServletContext();
		String realPath = servletContext.getRealPath("/");

		System.out.println("Real path: " + realPath);

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		Part part = request.getPart("logoFile");

		String fileToSavePath = "/Users/liarliarrrr/Documents/eclipse-workspace/JACKBOX/WebContent/avatars/" + username
				+ ".jpg";
		if (part != null || "".equals(part.getName())) {
			part.write(fileToSavePath);
			System.out.println("Write file successfully.");
		}

		HashUtil hashUtil = new HashUtil();
		String handledPassword = hashUtil.sha256Process(password);

		DBUtil dbUtil = new DBUtil();
		request.setAttribute("message", null);

		if (ifEmpty(username) || ifEmpty(password) || ifEmpty(email)) {
			RequestDispatcher rd = request.getRequestDispatcher("/account.jsp");
			request.setAttribute("message", "Input Empty");
			rd.forward(request, response);
		}

		try {

			String logoFilePath = "http://localhost:8080/JACKBOX/images/" + username + ".jpg";
			request.setAttribute("logoFilePath", logoFilePath);
			dbUtil.signupUser(username, handledPassword, email);

			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			request.setAttribute("message", "Hi " + username);
			HttpSession session = request.getSession();
			session.setAttribute("isLogin", Boolean.TRUE);
			session.setAttribute("username", username);
			rd.forward(request, response);

		} catch (SQLException e) {

			RequestDispatcher rd = request.getRequestDispatcher("/account.jsp");
			request.setAttribute("message", "Error: SQLException");
			rd.forward(request, response);
			e.printStackTrace();

		} catch (ClassNotFoundException e) {

			RequestDispatcher rd = request.getRequestDispatcher("/account.jsp");
			request.setAttribute("message", "Error: ClassNotFoundException");
			rd.forward(request, response);
			e.printStackTrace();

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private boolean ifEmpty(String string) {

		if (string.isEmpty() && string != null) {
			return true;
		}
		return false;

	}

}
