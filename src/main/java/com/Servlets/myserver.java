package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
public class myserver extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstname = request.getParameter("FirstName");
		String password = request.getParameter("Password");
		String email = request.getParameter("Email");
		String usergender = request.getParameter("user_gender");
		String course = request.getParameter("course");
		String checkbox = request.getParameter("condition");
		if( checkbox != null) {
			out.println( " <h3> password : " + password + " <h3>");
		}
		else {
			out.println("terms and conditions are not agreed");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
			out.println("this is buisneess");
		}
	}
}
