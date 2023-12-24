package com.demo.service;

import com.demo.beans.Rider;
import com.demo.dao.dao;
import com.demo.dao.daoImpl;

public class serviceImpl implements service {
	dao d=new daoImpl();
	
	public Rider validateRider(String username, String password) {
		// TODO Auto-generated method stub
		return d.validateRider(username,password);
	}

}
