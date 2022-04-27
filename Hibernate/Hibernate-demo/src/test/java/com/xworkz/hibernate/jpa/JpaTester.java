package com.xworkz.hibernate.jpa;

import com.xworkz.hibernate.RestaurantDAO;
import com.xworkz.hibernate.RestaurantEntity;

public class JpaTester {
public static void main(String[] args) {
		
		RestaurantEntity entity = new RestaurantEntity();
		entity.setContactNo(125478);
		entity.setType("non veg");
		entity.setName("Pradeep");
		entity.setRestaurantId(3);
		entity.setRating(5);
		
		RestaurantDAO jpaDao=new RestaurantDAO();
		jpaDao.saveRestaurant(entity);
		System.out.println("saved sucessfully....!");
	}

}

