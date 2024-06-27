package types.graphs;

import java.util.List;

public class ChartClient {
	
	public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5);
        Chart chart;
        ChartCreator chartCreator;
        
        chartCreator = new BarChartCreator();
        chart = chartCreator.createChart();
        chart.addData(data);
        chart.render();

        chartCreator = new LineChartCreator();
        chart = chartCreator.createChart();
        chart.addData(data);
        chart.render();
    }

}
