package report;

public class ReportGenerator {
    public void generateReport(Report report, String format) {
        if ("PDF".equalsIgnoreCase(format)) {
            System.out.println("Generating PDF report...");
            System.out.println("Title: " + report.getTitle());
            System.out.println("Content: " + report.getContent());
        } else if ("CSV".equalsIgnoreCase(format)) {
            System.out.println("Generating CSV report...");
            System.out.println("title,content");
            System.out.println(report.getTitle() + "," + report.getContent());
        } else if ("JSON".equalsIgnoreCase(format)) {
            System.out.println("Generating JSON report...");
            System.out.println("{");
            System.out.println("  \"title\": \"" + report.getTitle() + "\",");
            System.out.println("  \"content\": \"" + report.getContent() + "\"");
            System.out.println("}");
        } else {
            System.out.println("Invalid format.");
        }
    }
}
