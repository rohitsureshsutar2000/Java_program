package com.demo.service;

import java.lang.annotation.Annotation;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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

	public Pillion_route_details searchById(String route_id) {
		int id=Integer.parseInt(route_id);
		return dao.getById(id);
	}

	@Override
	public void addData(String route_id,String status_id, String startpoint, String endpoint, Date dt,
			String des) {
		int newroute_id=Integer.parseInt(route_id);
		int newstatus_id=Integer.parseInt(status_id);
		
//		date to string
		DateFormat ndt=new SimpleDateFormat("yyyy-MM-dd");
		String ddt=ndt.format(dt);
		Pillion_route_details p=new Pillion_route_details(newroute_id,newstatus_id,startpoint,endpoint,ddt,des);
		dao.addData(p);
	}

	@Override
	public void updateP(String rid, String status_id, String startpoint, String endpoint, Date dt,
			String des) {
		int newroute_id=Integer.parseInt(rid);
		int newstatus_id=Integer.parseInt(status_id);
		dao.updateP(newroute_id,newstatus_id,startpoint,endpoint,dt,des);
	}

	@Override
	public void deletebyId(String route_id) {
		int newroute_id=Integer.parseInt(route_id);
		dao.deletebyId(newroute_id);
	}


}
