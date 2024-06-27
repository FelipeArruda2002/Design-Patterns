package types.graphs;

public class BarChartCreator implements ChartCreator{

	@Override
	public Chart createChart() {
		return new BarChart();
	}

}
