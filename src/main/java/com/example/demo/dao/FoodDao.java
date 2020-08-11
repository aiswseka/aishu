package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Food;

public interface FoodDao extends JpaRepository<Food, Integer>{

	List<Food> findByHid(int hid);


}
