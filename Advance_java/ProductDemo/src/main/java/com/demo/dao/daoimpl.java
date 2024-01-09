package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class daoimpl implements dao {
	static Connection conn;
	static PreparedStatement getProducttable,
							 updateProducttable,
							 searchByIdProducttable,
							 addpro,
							 deletepro;
	static { try {
			
			conn=DBmanager.getMyConnection();
			getProducttable=conn.prepareStatement("select * from product");
			updateProducttable=conn.prepareStatement("update product set name=?,price=? where id=?");
			searchByIdProducttable=conn.prepareStatement("select * from product where id=?");
			addpro=conn.prepareStatement("insert into product values(?,?,?)");
			deletepro=conn.prepareStatement("delete from product where id=?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Product> getProduct()
	{
		List<Product> lst=new ArrayList<Product>();
		try {
			ResultSet rs=getProducttable.executeQuery();
			while(rs.next())
			{
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getString(3));
				lst.add(p);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
		
	}

	@Override
	public Product editProduct(int pid) {
		try {
			searchByIdProducttable.setInt(1, pid);
			ResultSet rs=searchByIdProducttable.executeQuery();
			Product p=null;
			if(rs.next())
				{p=new Product(rs.getInt(1),rs.getString(2),rs.getString(3));}
			
			return p;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updatepro(Product p) {
		
		try {
			updateProducttable.setString(1,p.getName());
			updateProducttable.setString(2,p.getPrice());
			updateProducttable.setInt(3,p.getId());
			updateProducttable.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addPro(Product p) {
		try {
			addpro.setInt(1,p.getId());
			addpro.setString(2,p.getName());
			addpro.setString(3,p.getPrice());
			
			addpro.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletepro(int pid) {
		try {
			deletepro.setInt(1,pid);
			deletepro.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
