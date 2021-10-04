package com.simplilearn.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection connection;
	
	public Connection getConnection() {
		return connection;
	}

	public DBConnection(String url, String uname, String pwd) throws
	ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		
		this.connection=DriverManager.getConnection(url,uname,pwd);
	}
	public void closeConnection() throws SQLException{
		if(this.connection!=null) {
			connection.close();
		}
	}
}
