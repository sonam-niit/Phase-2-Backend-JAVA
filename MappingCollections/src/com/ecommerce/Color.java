package com.ecommerce;

public class Color {

	private long COLORID;
	private String name;
	
	public Color() {
		// TODO Auto-generated constructor stub
	}

	public Color(String name) {
		super();
		this.COLORID=0;
		this.name = name;
	}

	public long getCOLORID() {
		return COLORID;
	}

	public void setCOLORID(long cOLORID) {
		COLORID = cOLORID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
