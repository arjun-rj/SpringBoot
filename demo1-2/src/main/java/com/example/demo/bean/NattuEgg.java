package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NattuEgg{

	@Id
	String id;
	String type;
	String color;
	Double price;
	int tray;
	public NattuEgg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getTray() {
		return tray;
	}
	public void setTray(int tray) {
		this.tray = tray;
	}
	
	
	
	
	
}
