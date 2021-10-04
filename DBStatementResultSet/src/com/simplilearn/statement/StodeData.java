package com.simplilearn.statement;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
 * Servlet implementation class StodeData
 */
@WebServlet("/insert")
public class StodeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			InputStream in=getServletContext().getResourceAsStream("/WEB-INF/config.properties");
			Properties props=new Properties();
			props.load(in);
			DBConnection conn=new DBConnection(props.getProperty("url"), 
					props.getProperty("username"), props.getProperty("password"));
			String name=request.getParameter("name");
			String price=request.getParameter("price");
			Connection connection=conn.getConnection();
			if(connection!=null) {
				
				PreparedStatement stmt=connection.prepareStatement
						("insert into product (name, price) values (?,?)");
				stmt.setString(1, name);
				stmt.setString(2, price);
				int x=stmt.executeUpdate();
				System.out.println("records updated "+x);
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
