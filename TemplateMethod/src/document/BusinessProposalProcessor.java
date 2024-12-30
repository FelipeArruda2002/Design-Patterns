package document;

public class BusinessProposalProcessor extends DocumentProcessor {
    @Override
    public void validateData() {
        System.out.println("Validating business proposal data.");
    }

    @Override
    public void processContent() {
        System.out.println("Processing business proposal content.");
    }
}
