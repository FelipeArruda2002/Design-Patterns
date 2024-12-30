package document;

public class DocumentProcessor {
    public void loadDocument(String filePath) {
        System.out.println("Loading document from: " + filePath);
    }

    public void validateData() {
        System.out.println("Validating data (default implementation)");
    }

    public void processContent() {
        System.out.println("Processing content (default implementation)");
    }

    public void generateDocument(String outputPath) {
        System.out.println("Generating document at: " + outputPath);
    }

    public void process(String inputFilePath, String outputFilePath) {
        loadDocument(inputFilePath);
        validateData();
        processContent();
        generateDocument(outputFilePath);
    }
}
