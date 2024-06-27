package types.graphs;

public class LineChartCreator implements ChartCreator {

	@Override
	public Chart createChart() {
		return new LineChart();
	}

}
