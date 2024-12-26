package report;

public class JSONReport implements ReportStrategy{

	@Override
	public void generateReport(Report report) {
		  System.out.println("Generating JSON report...");
          System.out.println("{");
          System.out.println("  \"title\": \"" + report.getTitle() + "\",");
          System.out.println("  \"content\": \"" + report.getContent() + "\"");
          System.out.println("}");
	}

}
