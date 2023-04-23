package com.jsp.saved.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class testgetall {

	
	public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sairaj"); 
		    EntityManager entityManager=entityManagerFactory.createEntityManager();
		    String sql="SELECT s FROM Pen s";
		    
		    Query query= entityManager.createQuery(sql);
		    
		    
		   
		 List<Pen> pens  =query.getResultList();
		    for(Pen p:pens) {
		    	System.out.println(p.getName());
		    	System.out.println(p.getBrand());
		    	System.out.println(p.getColour());
		    	System.out.println(p.getId());
		    	System.out.println("***********************");
		    }
		    
		    
	}
}
