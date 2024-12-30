package document;

public class FinancialReportProcessor extends DocumentProcessor {
    @Override
    public void validateData() {
        System.out.println("Validating financial report data.");
    }

    @Override
    public void processContent() {
        System.out.println("Processing financial report content.");
    }
}
