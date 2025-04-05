package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = ("/store.jsp"))
public class UserFilter implements Filter {

	public UserFilter() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpSession session = ((HttpServletRequest) request).getSession();
		Boolean isLogin = (Boolean) session.getAttribute("isLogin");
		request.setAttribute("message", null);

		if (Boolean.TRUE.equals(isLogin)) {
			chain.doFilter(request, response);
		} else {
			request.setAttribute("message", "Please login first");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/account.jsp");
			requestDispatcher.forward(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
