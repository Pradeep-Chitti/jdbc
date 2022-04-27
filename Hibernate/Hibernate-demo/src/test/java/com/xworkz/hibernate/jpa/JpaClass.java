package com.xworkz.hibernate.jpa;

import com.xworkz.hibernate.RestaurantEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaClass {
	public void saveRestorentJPA(RestaurantEntity entity) {
		
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Pradeep");
	    
	    EntityManager entitymanager = emfactory.createEntityManager( );
	    entitymanager.getTransaction().begin( );

	       entitymanager.persist( entity );
	    entitymanager.getTransaction( ).commit( );

	    entitymanager.close( );
	    emfactory.close( );
		}

	
}
