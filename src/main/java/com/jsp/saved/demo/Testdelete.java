package com.jsp.saved.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testdelete {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory(null); 
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		
	    
	  //  find byid
	    
	    
	   Pen p2=entityManager.find(Pen.class, 1);
	   entityTransaction.begin();
	    entityManager.persist(p2);
	    entityTransaction.commit();
	    System.out.println(p2.getName());
	   
	    
	}

}
