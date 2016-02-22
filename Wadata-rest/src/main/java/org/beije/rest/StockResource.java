package org.beije.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.beije.api.StockDTO;
import org.beije.api.StockResponse;


import org.beije.api.charting.Chart;
import org.beije.api.charting.Dataset;

import com.google.gson.Gson;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

@Path("/stock")
@Stateless
@Produces("application/json; charset=utf-8")
public class StockResource {

//	@Context
//	private UriInfo uriInfo;
//	@PersistenceContext(unitName = "firsty")
//	private EntityManager em;
	
	@GET
//	public List<Stock> getAllStocks(){
	public String getAllStocks(){
//		Query q = em.createNamedQuery("findAllStocks");
//		List<Stock> stocks = null;
//		try {
//			stocks = q.getResultList();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		StockResponse response = new StockResponse();
		
		StockDTO a = new StockDTO(1L, "Primo");
		StockDTO b = new StockDTO(2L, "Secondo");
		
		List<StockDTO> stocks = new ArrayList<StockDTO>();
		stocks.add(a);
		stocks.add(b);
		String ret = "";
		
		response.setArg(stocks);
		
		Gson gson = new Gson();
		ret = gson.toJson(response);
		
		
		return ret;
	}
	
	@GET
	@Path("/chart")
	public String getChart(){
		Chart chartData = Chart.createChart();
		List<String> labels = new ArrayList<String>();
		labels.add("Lunedì");
		labels.add("Martedì");
		labels.add("Mercoledì");
		labels.add("Giovedì");
		labels.add("Venerdì");
		labels.add("Sabato");
		labels.add("Domenica");
		
		List<Dataset> datasets = new ArrayList<Dataset>();
		
		Dataset ds1 = new Dataset();
		
		ds1.setLabel("Eni S.p.A.");
		ds1.setFillColor("rgba(220,220,220,0.2)");
		ds1.setStrokeColor("rgba(220,220,220,1)");
		ds1.setPointColor("rgba(220,220,220,1)");
		ds1.setPointStrokeColor("#fff");
		ds1.setPointHilightFill("#fff");
		ds1.setPointHighlightStroke("rgba(220,220,220,1)");
		
		List<Integer> data1 = new ArrayList<Integer>();
		
		data1.add(12);
		data1.add(13);
		data1.add(14);
		data1.add(15);
		data1.add(16);
		data1.add(17);
		data1.add(18);
		
		ds1.setData(data1);

		Dataset ds2 = new Dataset();

		ds2.setLabel("Mediolanum Bank S.p.A.");
		ds2.setFillColor("rgba(151,187,205,0.2)");
		ds2.setStrokeColor("rgba(151,187,205,1)");
		ds2.setPointColor("rgba(151,187,205,1)");
		ds2.setPointStrokeColor("#fff");
		ds2.setPointHilightFill("#fff");
		ds2.setPointHighlightStroke("rgba(151,187,205,1)");
		
		List<Integer> data2 = new ArrayList<Integer>();
		
		data2.add(29);
		data2.add(28);
		data2.add(27);
		data2.add(26);
		data2.add(25);
		data2.add(24);
		data2.add(23);
		
		ds2.setData(data2);
		
		datasets.add(ds1);
		datasets.add(ds2);
		
		chartData.setLabels(labels);
		chartData.setDatasets(datasets);
		
		Gson gson = new Gson();
		
		String ret = gson.toJson(chartData);
		
		return ret;
	}
	@GET
	@Path("/stock/{stockid}")
	public String getStock(@PathParam("stockid") Integer id){
		return null;
		
	}
}
