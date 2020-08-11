package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Food;
import com.example.demo.service.FoodService;

@RestController
public class FoodController {
	@Autowired
	FoodService foodService;
	

		
	@GetMapping(path = "/menu/{hid}")
	public List<Food> getMenu(@PathVariable int hid) {
		return foodService.getMenu(hid);
		
	}
	
	@GetMapping(path = "/menuPriceSorted")
	public List<Food> getMenuSorted() {
		return foodService.getMenuSorted();
	}	
		
}
