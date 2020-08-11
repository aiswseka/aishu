package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HotelDao;
import com.example.demo.model.Hotel;



@Service
public class HotelService {

	
	@Autowired
	private HotelDao hotelDao;
	
	public Optional<Hotel> getHotel(int hid) {
		
		return hotelDao.findById(hid);
	}

	public List<Hotel> getHotels() {
		return hotelDao.findAll();
	}

	public List<Hotel> getHotelsSorted() {
		return hotelDao.getByRatingsSorted();
	}

	public List<Hotel> getHotelsLocation(String loc) {
		return hotelDao.findAllByLocation(loc);
	}


}
