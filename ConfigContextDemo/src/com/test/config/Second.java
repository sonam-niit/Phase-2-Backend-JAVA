package com.test.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  ServletConfig config=null;
	  ServletContext context=null;
		@Override
		public void init(ServletConfig config) throws ServletException {
			this.config=config;
			this.context=config.getServletContext();
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pass=config.getInitParameter("password");
		PrintWriter out=response.getWriter();
		out.println("Password: "+pass);
		
		String username=context.getInitParameter("username");
		out.println("Context Parameter: "+username);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
