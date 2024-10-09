package texteditor;

public class Word {
	
    private String text;
    private TextFormat format;

    public Word(String text, TextFormat format) {
        this.text = text;
        this.format = format;
    }

    public void render() {
        format.applyFormat(text);
    }
}

