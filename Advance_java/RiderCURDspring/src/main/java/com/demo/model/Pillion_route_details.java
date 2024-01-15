package com.demo.model;

import java.sql.Date;

public class Pillion_route_details {
	private int route_id;
	private int status_id;
	private String start_point;
	private String end_point;
	private String travel_date;
	private String description;
	
	public Pillion_route_details() {
		super();
	}

	public Pillion_route_details(int route_id, int status_id, String start_point, String end_point, String travel_date,
			String description) {
		super();
		this.route_id = route_id;
		this.status_id = status_id;
		this.start_point = start_point;
		this.end_point = end_point;
		this.travel_date = travel_date;
		this.description = description;
	}

	public int getRoute_id() {
		return route_id;
	}

	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getStart_point() {
		return start_point;
	}

	public void setStart_point(String start_point) {
		this.start_point = start_point;
	}

	public String getEnd_point() {
		return end_point;
	}

	public void setEnd_point(String end_point) {
		this.end_point = end_point;
	}

	public String getTravel_date() {
		return travel_date;
	}

	public void setTravel_date(String travel_date) {
		this.travel_date = travel_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Pillion_route_details [route_id=" + route_id + ", status_id=" + status_id + ", start_point="
				+ start_point + ", end_point=" + end_point + ", travel_date=" + travel_date + ", description="
				+ description + "]";
	}
	
}
