package report;

public class ReportGeneratorFactory {
	
	public static ReportStrategy createReportGenerator(String format) {
		switch (format) {
			case "PDF":
				return new PDFReport();
			case "CSV":
				return new CSVReport();
			case "JSON":
				return new JSONReport();
			default:
				throw new IllegalArgumentException("Invalid report format: " + format);
		}
	}

}
