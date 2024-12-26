package report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report("Sales Report", "This is the sales report content.");

        ReportGenerator generator = new ReportGenerator(new PDFReport());
        generator.generateReport(report);
        generator = new ReportGenerator(new JSONReport());
        generator.generateReport(report);
        generator = new ReportGenerator(new CSVReport());
        generator.generateReport(report);
    }
}
