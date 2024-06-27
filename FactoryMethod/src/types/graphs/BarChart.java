package types.graphs;

public class BarChart extends Chart {

	@Override
	public void render() {
		System.out.println("Rendering Bar Chart with data: " + getData());
	}

}
