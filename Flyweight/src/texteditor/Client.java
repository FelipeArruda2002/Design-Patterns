package texteditor;

public class Client {

	public static void main(String[] args) {
		Document document = new Document();
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		// Adicionando palavras com formatação repetida
		document.addWord("Hello", flyweightFactory.getTextFormat("Arial", 12, "Black", false, false));
		document.addWord("world", flyweightFactory.getTextFormat("Arial", 12, "Black", false, false));
		document.addWord("This", flyweightFactory.getTextFormat("Arial", 14, "Red", true, false));
		document.addWord("is", flyweightFactory.getTextFormat("Arial", 14, "Red", true, false));
		document.addWord("a", flyweightFactory.getTextFormat("Arial", 12, "Black", false, false));
		document.addWord("test", flyweightFactory.getTextFormat("Arial", 12, "Black", false, false));

		// Renderizando o documento
		document.renderDocument();
	}

}
