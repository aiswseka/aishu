package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderDetails;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {


	@Autowired
	OrderService orderService;
	

		
	@PostMapping(path = "/placeOrder")
	public OrderDetails placeOrder(OrderDetails menu) {
		return orderService.placeOrder(menu);
		
	}
	
	@DeleteMapping(path = "/deleteOrder/{oid}")
	public String deleteOrder(@PathVariable int oid) {
		return orderService.deleteOrder(oid);
		
	}
	
}