package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FoodDao;
import com.example.demo.model.Food;

@Service
public class FoodService {

	@Autowired
	private FoodDao foodDao;
	

	public List<Food> getMenuSorted() {
		return foodDao.findAll(Sort.by(Sort.Direction.DESC, "price"));
		
	}

	public List<Food> getMenu(int hid) {
		return foodDao.findByHid(hid);
	}
	

}
