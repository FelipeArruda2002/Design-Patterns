package report;

public class InventoryReportGenerator extends ReportGenerator {
    @Override
    public void filterData() {
        System.out.println("Filtering inventory data by availability.");
    }

    @Override
    public void processData() {
        System.out.println("Summarizing inventory levels.");
    }
}
