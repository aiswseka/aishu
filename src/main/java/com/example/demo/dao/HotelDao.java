package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer> {

	@Query("from Hotel order by ratings desc")
	List<Hotel> getByRatingsSorted();

	List<Hotel> findAllByLocation(String loc);

}
