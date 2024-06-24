package types.graphs;

import java.util.List;

public class LineChart {
	
	private List<Integer> data;

	public void addData(List<Integer> data) {
		this.data = data;
	}

	public void render() {
		System.out.println("Rendering Line Chart with data: " + data);
	}
}
