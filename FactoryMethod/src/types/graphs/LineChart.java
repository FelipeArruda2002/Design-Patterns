package types.graphs;

public class LineChart extends Chart {
	 
	@Override
	public void render() {
		System.out.println("Rendering Line Chart with data: " + getData());
	}
}
