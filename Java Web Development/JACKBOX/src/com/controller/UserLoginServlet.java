package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hash.HashUtil;
import com.model.DBUtil;

@WebServlet("/login")

public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserLoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		
		HashUtil hashUtil = new HashUtil();
		String handledPassword = hashUtil.sha256Process(password);
		
		
		DBUtil dbUtil = new DBUtil();
		request.setAttribute("message", null);
		if (ifEmpty(username)) {
			RequestDispatcher rd = request.getRequestDispatcher("/account.jsp");
			request.setAttribute("message", "Input Empty");
			rd.forward(request, response);
		}
		try {

			if (dbUtil.loginUser(username, handledPassword) == 1) {
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				request.setAttribute("message", "Hi " + username);
				HttpSession session = request.getSession();
				session.setAttribute("isLogin", Boolean.TRUE);
				session.setAttribute("username", username);
				rd.forward(request, response);
			} else if (dbUtil.loginUser(username, handledPassword) == 0) {
				RequestDispatcher rd = request.getRequestDispatcher("/account.jsp");
				request.setAttribute("message", "Invalid Password");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("/account.jsp");
				request.setAttribute("message", "Invalid Username");
				rd.forward(request, response);
			}

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
