package com.jsp.saved.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testupdate {
	 public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory(null); 
		    EntityManager entityManager=entityManagerFactory.createEntityManager();
		    EntityTransaction entityTransaction=entityManager.getTransaction();

		    
		    
		    Pen  p=entityManager.find(Pen.class,2);
		    
		    p.setBrand("natraj");
		    
		    
		    entityTransaction.begin();
		    entityManager.merge(p);
		    entityTransaction.commit();

	}

}
