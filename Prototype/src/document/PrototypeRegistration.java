package document;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistration {
	
	private static PrototypeRegistration registrar;
	private static Map<String, Document> prototypes = new HashMap<String, Document>();
	
	private PrototypeRegistration(){
	}
	
	public static PrototypeRegistration getInstance() {
		if (registrar == null) {
			registrar = new PrototypeRegistration();
		}
		return registrar;
	}
	
	public void addPrototype(Document document) {
		if (!prototypes.containsKey(getKey(document))) {
			prototypes.put(getKey(document), document);
		}
	}
	
	public Document getPrototype(String key) throws CloneNotSupportedException {
		if (prototypes.containsKey(key)) {
			return (Document) prototypes.get(key).clone();
		}
		return null;
	}
	
	private static String getKey(Document document) {
		StringBuilder sb = new StringBuilder();
		return sb.append(document.getFormat())
				.append("-")
				.append(document.getVisibility())
				.toString();
	}

}
