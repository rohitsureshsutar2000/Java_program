package com.demo.service;

import java.util.HashMap;
import java.util.Scanner;

import com.demo.dao.Dao;
import com.demo.dao.DaoImpl;

public class ServiceImpl implements Service {

	Dao dao=new DaoImpl();

	@Override
	public void addItem() {
		dao.addItem();

	}

	@Override
	public void updateItem() {
		dao.updateItem();
		
	}

	@Override
	public void displayAll() {
		dao.displayAll();
		
	}

	@Override
	public void removeItem() {
		dao.removeItem();
		
	}

	@Override
	public void updatedData() {
		dao.updatedData();
		
	}

}
