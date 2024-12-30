package document;

public class Client {
    public static void main(String[] args) {
        DocumentProcessor financialProcessor = new FinancialReportProcessor();
        DocumentProcessor proposalProcessor = new BusinessProposalProcessor();

        System.out.println("Processing financial report:");
        financialProcessor.process("financial_data.csv", "financial_report.pdf");

        System.out.println("\nProcessing business proposal:");
        proposalProcessor.process("proposal_data.csv", "business_proposal.pdf");
    }
}
