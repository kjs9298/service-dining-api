package com.dining.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "restaurant_image")
public class RestaurantImage {
	
	@Id
	@Column(name = "restaurant_image_seqno")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long restaurantImageSeqNo;
	@Column(name = "image_url")
	private String imageUrl;
	@Column(name = "is_main_image")
	private boolean isMainImage;
	
	public long getRestaurantImageSeqNo() {
		return restaurantImageSeqNo;
	}

	public void setRestaurantImageSeqNo(long restaurantImageSeqNo) {
		this.restaurantImageSeqNo = restaurantImageSeqNo;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isMainImage() {
		return isMainImage;
	}

	public void setMainImage(boolean isMainImage) {
		this.isMainImage = isMainImage;
	}
}
