package com.simplilearn.init;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class EProduct {

	
	private long ID;
	private String name;
	private BigDecimal price;
	private Date dateAdded;

	private ProductParts parts;
	public EProduct() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductParts getParts() {
		return parts;
	}

	public void setParts(ProductParts parts) {
		this.parts = parts;
	}

	public long getID() {
		return this.ID;
	}

	public String getName() {
		return this.name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setID(long id) {
		this.ID = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setDateAdded(Date date) {
		this.dateAdded = date;
	}

	@Override
	public String toString() {
		return "EProduct [ID=" + ID + ", name=" + name + ", price=" + price + ", dateAdded=" + dateAdded + "]";
	}
	
}
