package texteditor;

public class TextFormat {

	private String font;
	private int fontSize;
	private String color;
	private boolean bold;
	private boolean italic;

	public TextFormat(String font, int fontSize, String color, boolean bold, boolean italic) {
		this.font = font;
		this.fontSize = fontSize;
		this.color = color;
		this.bold = bold;
		this.italic = italic;
	}

	public void applyFormat(String text) {
		System.out.println("Applying format to text: " + text + " [Font: " + font + ", Size: " + fontSize + ", Color: "
				+ color + ", Bold: " + bold + ", Italic: " + italic + "]");
	}

}
