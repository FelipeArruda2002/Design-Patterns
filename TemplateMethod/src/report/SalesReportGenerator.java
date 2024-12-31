package report;

public class SalesReportGenerator extends ReportGenerator {
    @Override
    public void filterData() {
        System.out.println("Filtering sales data by region.");
    }

    @Override
    public void processData() {
        System.out.println("Aggregating sales data.");
    }

    @Override
    public void optionalStep() {
        System.out.println("Adding watermark: 'Confidential'.");
    }
}
