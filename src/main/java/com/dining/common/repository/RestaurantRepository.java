package com.dining.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dining.common.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
	
}
