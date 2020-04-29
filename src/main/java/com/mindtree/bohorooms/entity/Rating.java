package com.mindtree.bohorooms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rating {
	@Id
	private int rating;
	@ManyToOne
	@JoinColumn(name = "facility")
	
	private LivingFacility livingFacility;
	
	@ManyToOne
	@JoinColumn(name = "user")
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public LivingFacility getLivingFacility() {
		return livingFacility;
	}
	public void setLivingFacility(LivingFacility livingFacility) {
		this.livingFacility = livingFacility;
	}
	
}
