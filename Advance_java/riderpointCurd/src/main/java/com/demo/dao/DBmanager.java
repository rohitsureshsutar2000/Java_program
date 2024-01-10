package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBmanager {
	static Connection conn=null;
	public static Connection getMyConnection()
	{
		if(conn==null)
		{
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String conString="jdbc:mysql://localhost:3306/dummy?useSSL=false";
				conn=DriverManager.getConnection(conString,"root","welcome");
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return conn;
	}
	public static void closeMyConnection() {
		if(conn!=null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
