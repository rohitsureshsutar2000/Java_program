package com.demo.beans;

public class Rider {
	private int id ;
	private String name;
	private String mobile;
	private String String;
	
	public Rider() {
		super();
	}

	public Rider(int id, java.lang.String name, java.lang.String mobile, java.lang.String string) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		String = string;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getString() {
		return String;
	}

	public void setString(String string) {
		String = string;
	}

	@Override
	public String toString() {
		return "Rider [id=" + id + ", name=" + name + ", mobile=" + mobile + ", String=" + String + "]";
	}
	
	
	
	
}
