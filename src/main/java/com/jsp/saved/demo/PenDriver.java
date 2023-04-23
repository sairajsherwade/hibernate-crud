package com.jsp.saved.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PenDriver {
	public static void main(String[] args) {
	    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sairaj"); 
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    
	    Pen p1=new Pen();
	    p1.setName("cello");
	      p1.setBrand("apsara");
	    p1.setColour("yellow");
	    
	    entityTransaction.begin();
	    entityManager.persist(p1);
	    entityTransaction.commit();
	    
	          

	    
	    }


}
