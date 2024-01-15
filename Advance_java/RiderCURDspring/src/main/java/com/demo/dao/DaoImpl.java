package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Pillion_route_details;

@Repository
public class DaoImpl implements Dao {
	@Autowired
	private JdbcTemplate jdbctemp;
	
	public List<Pillion_route_details> getall() {
		
		  return jdbctemp.query("select * from pillion_route_details", (rs,num)->{
								  Pillion_route_details p=new Pillion_route_details();
								  p.setRoute_id(rs.getInt(1)); 
								  p.setStatus_id(rs.getInt(2));
								  p.setStart_point(rs.getString(3));
								  p.setEnd_point(rs.getString(4));
								  p.setTravel_date(rs.getString(5));
								  p.setDescription(rs.getString(6));
								  return p;
								  });
		 
		
		
	}

}
