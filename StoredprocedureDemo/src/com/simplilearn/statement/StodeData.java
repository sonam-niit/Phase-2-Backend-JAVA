package com.simplilearn.statement;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
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
			//store data using stored procedure
			String name=request.getParameter("pname");
			String price=request.getParameter("pprice");
			
			CallableStatement stmt=conn.getConnection().
					prepareCall("{call add_product(?,?)}");
			stmt.setString(1, name);
			stmt.setBigDecimal(2, new BigDecimal(Double.parseDouble(price)));
			
			int x=stmt.executeUpdate();
			out.println("rows affected "+x);
			
			stmt.close();
			conn.closeConnection();
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
