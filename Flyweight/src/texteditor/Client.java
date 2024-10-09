package texteditor;

public class Client {

	public static void main(String[] args) {
		Document document = new Document();

		// Adicionando palavras com formatação repetida
		document.addWord("Hello", "Arial", 12, "Black", false, false);
		document.addWord("world", "Arial", 12, "Black", false, false);
		document.addWord("This", "Arial", 14, "Red", true, false);
		document.addWord("is", "Arial", 14, "Red", true, false);
		document.addWord("a", "Arial", 12, "Black", false, false);
		document.addWord("test", "Arial", 12, "Black", false, false);

		// Renderizando o documento
		document.renderDocument();
	}

}
