package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Hotel {
	
	@Id
	int hId;
	String hName;
	String location;
	int ratings;
	
	
	public int gethId() {
		return hId;
	}



	public void sethId(int hId) {
		this.hId = hId;
	}


	public String gethName() {
		return hName;
	}


	public Hotel(int hId, String hName, String location, int ratings) {
		super();
		this.hId = hId;
		this.hName = hName;
		this.location = location;
		this.ratings = ratings;
	}



	public void sethName(String hName) {
		this.hName = hName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getRatings() {
		return ratings;
	}


	public void setRatings(int ratings) {
		this.ratings = ratings;
	}


}
