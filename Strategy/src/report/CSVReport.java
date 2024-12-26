package report;

public class CSVReport implements ReportStrategy{

	@Override
	public void generateReport(Report report) {
		System.out.println("Generating CSV report...");
        System.out.println("title,content");
        System.out.println(report.getTitle() + "," + report.getContent());
	}

}
