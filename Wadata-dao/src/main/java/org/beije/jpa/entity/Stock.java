package org.beije.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Stock
 *
 */
@Entity
@Table(name="Stocks")

@NamedQuery(name = "findAllStocks", query = "SELECT s FROM Stock s")
public class Stock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2172951139258659578L;

	@Column(name="STOCKID")
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	@Column(nullable=false, name="STOCKNAME")
	private String name;
	
	public Stock(Long id, String name){
		this.id = id;
		this.name = name;
	}
	
	public Stock(){
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
