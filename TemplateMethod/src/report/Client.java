package report;

public class Client {
    public static void main(String[] args) {
        ReportGenerator salesReport = new SalesReportGenerator();
        ReportGenerator inventoryReport = new InventoryReportGenerator();

        System.out.println("Generating sales report:");
        salesReport.generate("sales_data.csv", "sales_report.pdf");

        System.out.println("\nGenerating inventory report:");
        inventoryReport.generate("inventory_data.csv", "inventory_report.pdf");
    }
}
