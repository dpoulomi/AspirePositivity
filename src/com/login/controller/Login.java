package com.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Starting login servlet!");
		final String uname = request.getParameter("uname");
		final String pass = request.getParameter("pass");
		if (uname.equals("Polo")) {
			response.sendRedirect("NewFile.html");
		} else {
			response.sendRedirect("AboutUs.jsp");
		}
		// response.sendRedirect(arg0);
	}

}
