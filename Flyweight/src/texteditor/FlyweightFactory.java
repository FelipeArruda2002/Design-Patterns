package texteditor;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private Map<String, TextFormat> textFormats = new HashMap<String, TextFormat>();
	
	public TextFormat getTextFormat(String font, int fontSize, String color, boolean bold, boolean italic) {
		String mapKey = formatMapKey(font, fontSize, color, bold, italic);
		if (!textFormats.containsKey(mapKey)) {
			TextFormat textFormat = new TextFormat(font, fontSize, color, bold, italic);
			textFormats.put(mapKey, textFormat);
		}
		return textFormats.get(mapKey);
	}
	
	private String formatMapKey(String font, int fontSize, String color, boolean bold, boolean italic) {
		return String.format("%s#%d#%s#%b#%b", font, fontSize, color, bold, italic);
	}
}
