package com.demo.dao;

import java.sql.Date;
import java.util.List;

import com.demo.model.Pillion_route_details;

public interface Dao {

	List<Pillion_route_details> getall();

	Pillion_route_details getById(int id);

	void addData(Pillion_route_details p);

	void updateP(int newroute_id, int newstatus_id, String startpoint, String endpoint, Date dt,
			String des);

	void deletebyId(int newroute_id);
	
}
