package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.Rider;

public class LoginDaoimpl implements Logindao {
	static Connection conn;
	static PreparedStatement valid;
	static {
		
		try {
			conn=DBmanager.getMyConnection();
			valid=conn.prepareStatement("select username,password from loginrider where username=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public Rider validUser(String uname, String pass) {
		try {
			valid.setString(1, uname);
			valid.setString(2, pass);
			ResultSet rs=valid.executeQuery();
//			System.out.println(rs.getString(1));
//			System.out.println(rs.getString(2));
			
			if(rs.next())
			{
				
				return new Rider(rs.getString(1),rs.getString(2));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

}
