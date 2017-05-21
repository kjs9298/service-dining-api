package com.dining.common.model;

import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Restaurant {
	
	@Id 
	@Column(name = "restaurant_seqno")
	@GeneratedValue
	private Long restaurantSeqNo;
	
	@Column(name = "name")
	private String name;
	@Column(name = "food_tp")
	private String foodType;
	@Column(name = "loc_lat")
	private double latitude;
	@Column(name = "loc_long")
	private double longitude;
	@Column(name = "contact_num")
	private String contactNumber;
	
	@Column(name = "register")
	private String register;
	@Column(name = "regist_mail")
	private String registerEmail;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(name = "regist_dt")
	private LocalDateTime registerDate;
	@Column(name = "updater")
	private String updater;
	@Column(name = "update_mail")
	private String updaterEmail;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(name = "update_dt")
	private LocalDateTime updateDate;
	
	@OneToMany 
	@JoinColumn(name="restaurant_seqno") 
	private Collection<RestaurantImage> images;
	
	@OneToMany 
	@JoinColumn(name="restaurant_seqno") 
	private Collection<RestaurantTag> tags;
		
	public Long getRestaurantSeqNo() {
		return restaurantSeqNo;
	}
	public void setRestaurantSeqNo(Long restaurantSeqNo) {
		this.restaurantSeqNo = restaurantSeqNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getRegisterEmail() {
		return registerEmail;
	}
	public void setRegisterEmail(String registerEmail) {
		this.registerEmail = registerEmail;
	}
	public LocalDateTime getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = registerDate;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	public String getUpdaterEmail() {
		return updaterEmail;
	}
	public void setUpdaterEmail(String updaterEmail) {
		this.updaterEmail = updaterEmail;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	public Collection<RestaurantImage> getImages() {
		return images;
	}
	public void setImages(Collection<RestaurantImage> images) {
		this.images = images;
	}
	public Collection<RestaurantTag> getTags() {
		return tags;
	}
	public void setTags(Collection<RestaurantTag> tags) {
		this.tags = tags;
	}

}
