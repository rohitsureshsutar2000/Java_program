package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.Rider;
import com.mysql.cj.protocol.Resultset;

public class daoImpl implements dao{
	
	static Connection conn=null;
	static PreparedStatement validate;
	{
		conn=DBUtil.getConnection();
		try {
			validate=conn.prepareStatement("select username,password from loginrider username=? and password=?");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public Rider validateRider(String username,String password) {
		try {
			validate.setString(1,username);
			validate.setString(2,password);
			ResultSet rs=validate.executeQuery();
//			return new (1,rs.getString(1),rs.getString(2));
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	
	
}
