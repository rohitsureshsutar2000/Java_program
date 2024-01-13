package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	private int addrId;
	private String street;
	private String city;
	@OneToOne(mappedBy = "addr")
	private MyUser u;
	public Address(int addrId, String street, String city) {
		super();
		this.addrId = addrId;
		this.street = street;
		this.city = city;
		
	}
	public Address(int addrId, String street, String city ,MyUser u) {
		super();
		this.addrId = addrId;
		this.street = street;
		this.city = city;
		this.u = u;
	}
	public MyUser getU() {
		return u;
	}
	public void setU(MyUser u) {
		this.u = u;
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
		return "Address [addrId=" + addrId + ", street=" + street + ", city=" + city + ", u=" + u + "]";
	}
	


	
	
	
}
