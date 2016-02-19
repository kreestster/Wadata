package org.beije.api;

import java.util.List;
import org.beije.jpa.entity.Stock;

public class StockResponse {
	private List<Stock> arg;

	public List<Stock> getArg() {
		return arg;
	}

	public void setArg(List<Stock> arg) {
		this.arg = arg;
	}
	
}
