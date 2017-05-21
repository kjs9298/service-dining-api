package com.dining.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dining.common.model.Restaurant;
import com.dining.common.repository.RestaurantRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private RestaurantRepository repository;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void create(Restaurant restaurant) {
		repository.save(restaurant);
	}
	
	@RequestMapping("/update")
	public void update(Restaurant restaurant) {
		
	}
	
	@RequestMapping("/remove/{restaurantSeqNo}")
	public void remove(@PathVariable long restaurantSeqNo) {
		repository.delete(restaurantSeqNo);
	}
	
	@RequestMapping("/list")
	public List<Restaurant> list(){
		List<Restaurant> restaurantList = repository.findAll();
		return restaurantList;
	}
	
	@RequestMapping("/get/{restaurantSeqNo}")
	public Restaurant get(@PathVariable long restaurantSeqNo){
		Restaurant restaurant = repository.findOne(restaurantSeqNo);
		return restaurant;
	}
	
}
