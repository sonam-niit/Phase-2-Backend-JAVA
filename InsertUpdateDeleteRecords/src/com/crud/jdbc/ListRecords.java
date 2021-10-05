package com.crud.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListRecords
 */
@WebServlet("/list")
public class ListRecords extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		try {
			InputStream in=getServletContext().getResourceAsStream("/WEB-INF/config.properties");
			Properties props=new Properties();
			props.load(in);
			Connection conn=Config.getconnection(props.getProperty("url"), props.getProperty("user"),
					props.getProperty("password"));
			Statement stmt=conn.createStatement();
			ResultSet result=stmt.executeQuery("select * from student");
			
			while(result.next()) {
				out.println(result.getString("fname")+" "+result.getString("lname")+
						" "+result.getString("email")+" "+result.getString("password")+
						"<a href='delete?id="+result.getString("id")+"'>Delete</a>"+" "+
						"<a href='update?id="+result.getString("id")+"'>UPDATE</a>"+"<br>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
