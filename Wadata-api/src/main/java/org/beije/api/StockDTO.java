package org.beije.api;

public class StockDTO {
	private Long id;
	private String name;
	
	public StockDTO(long l, String string) {
		this.id = l;
		this.name = string;
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
