package document;

public abstract class DocumentProcessor {
	
	protected final void loadDocument(String filePath) {
        System.out.println("Loading document from: " + filePath);
    }

    protected final void generateDocument(String outputPath) {
        System.out.println("Generating document at: " + outputPath);
    }
    
    protected abstract void validateData();
    protected abstract void processContent();

    public final void process(String inputFilePath, String outputFilePath) {
        loadDocument(inputFilePath);
        validateData();
        processContent();
        generateDocument(outputFilePath);
    }
}
