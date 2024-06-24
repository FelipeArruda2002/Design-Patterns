package types.graphs;

import java.util.List;

public class ChartClient {
	
	public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5);

        BarChart barChart = new BarChart();
        barChart.addData(data);
        barChart.render();

        LineChart lineChart = new LineChart();
        lineChart.addData(data);
        lineChart.render();
    }

}
