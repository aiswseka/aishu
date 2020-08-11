package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hotel;
import com.example.demo.service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@RequestMapping(path = "/")
	public String test() {
		System.out.println("TEST");
		return "Connecting";
		
	}
		
	@GetMapping(path = "/getHotel/{hid}")
	public Optional<Hotel> getHotel(@PathVariable int hid) {
		return hotelService.getHotel(hid);
		
	}
	
	@GetMapping(path = "/getHotels")
	public List<Hotel> getHotels() {
		return hotelService.getHotels();
		
	}
	
	@GetMapping(path = "/getHotelsSorted")
	public List<Hotel> getHotelsSorted() {
		return hotelService.getHotelsSorted();
		
	}
	
	@GetMapping(path = "/getHotels/location/{loc}")
	public List<Hotel> getHotelsLocation(@PathVariable String loc) {
		return hotelService.getHotelsLocation(loc);
		
	}

}
