package com.demo.service;

import java.sql.Date;
import java.util.List;

import com.demo.model.Pillion_route_details;

public interface PillionService {

	List<Pillion_route_details> getall();

	Pillion_route_details searchById(String route_id);

	void addData(String route_id, String status_id, String startpoint, String endpoint, Date dt, String des);

	void updateP(String rid, String status_id, String startpoint, String endpoint, Date dt,
			String des);

}
