package org.beije.api.Chart;

import java.util.List;

public class Chart {
	public static Chart createChart() {
		return new Chart();
	}

	private List<String> labels;
	private List<Dataset> datasets;

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<Dataset> getDatasets() {
		return datasets;
	}

	public void setDatasets(List<Dataset> datasets) {
		this.datasets = datasets;
	}

}
