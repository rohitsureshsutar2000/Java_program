package com.demo.dao;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

	@Override
	public Pillion_route_details getById(int id) {
//		return null;
		return jdbctemp.queryForObject("select * from pillion_route_details where route_id=?", new Object[] {id},BeanPropertyRowMapper.newInstance(Pillion_route_details.class));
	}

	@Override
	public void addData(Pillion_route_details p) {
//		string to date
		java.util.Date d=null;
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		try {
			d=df.parse(p.getTravel_date());
		} catch (ParseException e) {	e.printStackTrace();	}
		jdbctemp.update("insert into Pillion_route_details values(?,?,?,?,?,?)", new Object[] {p.getRoute_id(),p.getStatus_id(),p.getStart_point(),p.getEnd_point(),d,p.getDescription()});
	}

	@Override
	public void updateP(int newroute_id, int newstatus_id, String startpoint, String endpoint, Date dt,
			String des) {
				String x="update Pillion_route_details set status_id=?, start_point=?, end_point=?, travel_date=? description=? where route_id=?";
				jdbctemp.update(x, new Object[] {newstatus_id,startpoint,endpoint,dt,des,newroute_id}) ;
	}

}
