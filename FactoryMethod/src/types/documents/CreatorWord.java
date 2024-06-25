package types.documents;

/**
 * Concrete Creator
 */
public class CreatorWord implements DocumentFactory {

	@Override
	public Document createDocument() {
		return new WordDocument();
	}

}
