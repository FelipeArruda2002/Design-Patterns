package report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report("Sales Report", "This is the sales report content.");

        ReportGenerator generator = new ReportGenerator();
        generator.generateReport(report, "PDF");
        generator.generateReport(report, "CSV");
        generator.generateReport(report, "JSON");
    }
}
