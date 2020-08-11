package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.OrderDetailsDao;
import com.example.demo.model.OrderDetails;


@Service
public class OrderService {

	
	@Autowired
	private OrderDetailsDao orderDao;

	public OrderDetails placeOrder(@RequestBody OrderDetails menu) {
		System.out.println(menu);
		
		orderDao.save(menu);
		return menu;
	}

	public String deleteOrder(int oid) {
		OrderDetails order  = orderDao.getOne(oid);
		orderDao.delete(order);
		return "Deleted";
	}
	

}
