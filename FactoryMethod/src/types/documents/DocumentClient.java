package types.documents;

public class DocumentClient {

	public static void main(String[] args) {
		DocumentFactory factory;
		Document document;
		
		factory = new CreatorPDF();
		document = factory.createDocument();
		System.out.println(document.create());
		
		factory = new CreatorWord();
		document = factory.createDocument();
		System.out.println(document.create());
	}
	
}
