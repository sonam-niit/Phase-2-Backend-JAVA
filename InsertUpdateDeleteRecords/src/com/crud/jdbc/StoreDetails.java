package com.crud.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class StoreDetails
 */
@WebServlet("/insert")
public class StoreDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String lanme=request.getParameter("lname");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		
		try {
			InputStream in=getServletContext().getResourceAsStream("/WEB-INF/config.properties");
			Properties props=new Properties();
			props.load(in);
			Connection conn=Config.getconnection(props.getProperty("url"), props.getProperty("user"),
					props.getProperty("password"));
			PreparedStatement pst=conn.prepareStatement
					("insert into student (fname,lname,email,password) values (?,?,?,?)");
			pst.setString(1, fname);
			pst.setString(2, lanme);
			pst.setString(3, email);
			pst.setString(4, pass);
			
			int x=pst.executeUpdate();
			System.out.println("Records Updated "+x);
			
			response.sendRedirect("list");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
