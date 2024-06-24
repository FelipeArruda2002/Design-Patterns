package types.graphs;

import java.util.List;

public class BarChart {

	private List<Integer> data;

	public void addData(List<Integer> data) {
		this.data = data;
	}

	public void render() {
		System.out.println("Rendering Bar Chart with data: " + data);
	}

}
