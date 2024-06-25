package types.documents;

/**
 * Concrete Creator
 */
public class CreatorPDF implements DocumentFactory {

	@Override
	public Document createDocument() {
		return new PDFDocument();
	}

}
