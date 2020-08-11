package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.FoodDao;
import com.example.demo.dao.HotelDao;
import com.example.demo.dao.OrderDetailsDao;
import com.example.demo.model.Food;
import com.example.demo.model.Hotel;
import com.example.demo.model.OrderDetails;
import com.example.demo.service.FoodService;
import com.example.demo.service.HotelService;
import com.example.demo.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private FoodService foodService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private HotelService hotelService;
	
	@MockBean
	private FoodDao foodDao;
	
	@MockBean
	private OrderDetailsDao orderDao;
	
	@MockBean
	private HotelDao hotelDao;
	
	
	
//	Food Service Test
	
	@Test
	void getMenuTest() {
		int hid= 101;
		
		when(foodDao.findByHid(hid)).thenReturn((Stream.of(new Food(11,"Idly",101,200),
				new Food(12,"Dosa",101,60)).collect(Collectors.toList())));
		assertEquals(2,foodService.getMenu(hid).size());
	}
	
	@Test
	void getMenuSortedTest() {
		when(foodDao.findAll(Sort.by(Sort.Direction.DESC, "price"))).thenReturn((Stream.of(new Food(11,"Idly",101,200),
				new Food(12,"Dosa",101,60)).collect(Collectors.toList())));
		assertEquals(2,foodService.getMenuSorted().size());
	}
	
	
//	Order Service Test
	
	@Test
	void placeOrderTest() {
		OrderDetails order = new OrderDetails(1022,"Aiswarya", "Sangeetha", 3, 850);
		
		when(orderDao.save(order)).thenReturn(order);
		assertEquals(order,orderService.placeOrder(order));
	}
	
	@Test
	void deleteOrderTest() {
		OrderDetails order = new OrderDetails(1022,"Aiswarya", "Sangeetha", 3, 850);
		
		when(orderDao.getOne(order.getoId())).thenReturn(order);
		orderService.deleteOrder(order.getoId());
		verify(orderDao,times(1)).delete(order);
	}
	
//	Hotel Service Test
	

	@Test
	void getHotelTest() {
		int hid= 105;
		Optional<Hotel> hotel = Optional.ofNullable(new Hotel(105,"Kuppanna","Chennai",4));
		
		when(hotelDao.findById(hid)).thenReturn(hotel);
		assertEquals(hotel,hotelDao.findById(hid));
	}
	
	@Test
	void getHotelsLocationTest() {
		String loc = "Chennai";
		when(hotelDao.findAllByLocation(loc)).thenReturn((Stream.of(new Hotel(105,"Kuppanna","Chennai",4),
				new Hotel(107,"BananaLeaf","Chennai",3)).collect(Collectors.toList())));
		assertEquals(2,hotelService.getHotelsLocation(loc).size());
	}
}
