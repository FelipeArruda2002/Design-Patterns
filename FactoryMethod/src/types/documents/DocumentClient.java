package types.documents;

public class DocumentClient {

	public static void main(String[] args) {
		PDFDocument pdfDocument = new PDFDocument();
		System.out.println(pdfDocument.create());

		WordDocument wordDocument = new WordDocument();
		System.out.println(wordDocument.create());
	}

}
