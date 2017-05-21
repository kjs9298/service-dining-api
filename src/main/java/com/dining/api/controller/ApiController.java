package com.dining.api.controller;

import java.security.InvalidParameterException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dining.common.model.Restaurant;
import com.dining.common.repository.RestaurantRepository;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private RestaurantRepository repository;
	
	@RequestMapping(value = "/restaurants", method = RequestMethod.GET)
	public Page<Restaurant> list(
			@PageableDefault(value = 5) Pageable pageable
	){
		Page<Restaurant> restaurantList = repository.findAll(pageable);
		return restaurantList;
	} 
	
	@RequestMapping(value = "/restaurant/{restaurantSeqNo}", method = RequestMethod.GET)
	public Restaurant get(@PathVariable long restaurantSeqNo){
		if(restaurantSeqNo <= 0) {
			throw new InvalidParameterException();
		}
		
		Restaurant restaurant = repository.findOne(restaurantSeqNo);
		return restaurant;
	}
	
}
