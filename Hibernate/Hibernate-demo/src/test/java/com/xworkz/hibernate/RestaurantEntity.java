package com.xworkz.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Rest")
public class RestaurantEntity {
	
	@Id
	@Column(name="Id")
	private int restaurantId;
	@Column(name="contact")
	private long contactNo;
	private String name;
	private String type;
	private double rating; 

}
