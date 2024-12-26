package report;

public class PDFReport implements ReportStrategy {

	@Override
	public void generateReport(Report report) {
		System.out.println("Generating PDF report...");
        System.out.println("Title: " + report.getTitle());
        System.out.println("Content: " + report.getContent());
	}

}
