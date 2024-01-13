package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int addrId;
	private String street;
	private String city;
	
	
	public Address(int addrId, String street, String city) {
		super();
		this.addrId = addrId;
		this.street = street;
		this.city = city;
	}
	public Address() {
		super();
	}
	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", street=" + street + ", city=" + city + "]";
	}


	
	
	
}
