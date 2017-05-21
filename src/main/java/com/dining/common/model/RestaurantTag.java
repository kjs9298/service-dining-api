package com.dining.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "restaurant_tag")
public class RestaurantTag {
	
	@Id
	@Column(name = "restaurant_tag_seqno")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long restaurantTagSeqNo;
	@Column(name = "tag")
	private String tag;
	
	public long getRestaurantTagSeqNo() {
		return restaurantTagSeqNo;
	}

	public void setRestaurantTagSeqNo(long restaurantTagSeqNo) {
		this.restaurantTagSeqNo = restaurantTagSeqNo;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
