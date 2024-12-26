package report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report("Sales Report", "This is the sales report content.");

        ReportGenerator generator = new ReportGenerator(ReportGeneratorFactory.createReportGenerator("PDF"));
        generator.generateReport(report);
        generator = new ReportGenerator(ReportGeneratorFactory.createReportGenerator("JSON"));
        generator.generateReport(report);
        generator = new ReportGenerator(ReportGeneratorFactory.createReportGenerator("CSV"));
        generator.generateReport(report);
    }
}
