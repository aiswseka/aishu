package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderDetails {

	@Id
	int oId;
	
	String customerName;
	String hname;
	
	int quantity;
	int amount ;
	

	public OrderDetails(int oId, String customerName, String hname, int quantity, int amount) {
		super();
		this.oId = oId;
		this.customerName = customerName;
		this.hname = hname;
		this.quantity = quantity;
		this.amount = amount;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	} 
	
	

}
