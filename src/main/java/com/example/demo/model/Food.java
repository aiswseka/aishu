package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {

	@Id
	int fId;
	
	String foodItem;
	
	int hid;
	int price ; 
	


	public Food(int fId, String foodItem, int hid, int price) {
	super();
	this.fId = fId;
	this.foodItem = foodItem;
	this.hid = hid;
	this.price = price;
	}
	
	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	

}
