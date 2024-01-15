package com.demo.service;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.dao.Dao;
import com.demo.model.Pillion_route_details;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements PillionService{
	@Autowired
	private Dao dao;
	
	public List<Pillion_route_details> getall() {
		return dao.getall();
	}


}
