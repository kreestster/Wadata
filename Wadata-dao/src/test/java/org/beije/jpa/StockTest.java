package org.beije.jpa;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.beije.jpa.entity.*;


public class StockTest {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction tx;
	
	@BeforeClass
	public static void initEntityManager() throws Exception {
		emf = Persistence.createEntityManagerFactory("wadataPU");
		em = emf.createEntityManager();
	}
	
	@AfterClass
	public static void closeEntityManager() throws Exception {
		em.close();
		emf.close();
	}
	
	@Before
	public void initTransaction() throws Exception {
		tx = em.getTransaction();
	}
	
	@Test
	public void createStock() throws Exception {
		Stock stock = new Stock();
		
		stock.setName("Apple");
		
		tx.begin();
		em.persist(stock);
		tx.commit();
		
		assertNotNull("Id should not be null", stock.getId());
		
		List<Stock> stocks = em.createNamedQuery("findAllStocks").getResultList();
		
		assertNotNull(stocks);
	}
	
}
