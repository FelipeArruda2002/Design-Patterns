package report;

public class ReportGenerator {
	
	private ReportStrategy strategy;
	
    public ReportGenerator(ReportStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void generateReport(Report report) {
       this.strategy.generateReport(report);
    }
}
