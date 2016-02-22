package org.beije.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.beije.jpa.entity.Stock;

public class Main {
	public static void main(String[] args){
		Stock stock = new Stock();
		
		stock.setName("NewStock");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BeijeJPA");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(stock);
		tx.commit();
		
		em.close();
		emf.close();
		
	}
}
