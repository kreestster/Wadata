package org.beije.api.charting;

import java.util.List;

public class Dataset {
	private String label;
	private String fillColor;
	private String strokeColor;
	private String pointColor;
	private String pointStrokeColor;
	private String pointHilightFill;
	private String pointHighlightStroke;
	
	private List<Integer> data;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getStrokeColor() {
		return strokeColor;
	}

	public void setStrokeColor(String strokeColor) {
		this.strokeColor = strokeColor;
	}

	public String getPointColor() {
		return pointColor;
	}

	public void setPointColor(String pointColor) {
		this.pointColor = pointColor;
	}

	public String getPointStrokeColor() {
		return pointStrokeColor;
	}

	public void setPointStrokeColor(String pointStrokeColor) {
		this.pointStrokeColor = pointStrokeColor;
	}

	public String getPointHilightFill() {
		return pointHilightFill;
	}

	public void setPointHilightFill(String pointHilightFill) {
		this.pointHilightFill = pointHilightFill;
	}

	public String getPointHighlightStroke() {
		return pointHighlightStroke;
	}

	public void setPointHighlightStroke(String pointHighlightStroke) {
		this.pointHighlightStroke = pointHighlightStroke;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}
	
	

}
