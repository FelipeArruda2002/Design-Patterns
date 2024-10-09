package texteditor;

import java.util.ArrayList;
import java.util.List;

public class Document {
	
    private List<Word> words = new ArrayList<>();

    public void addWord(String text, String font, int fontSize, String color, boolean bold, boolean italic) {
        TextFormat format = new TextFormat(font, fontSize, color, bold, italic); // Criação repetida de format
        Word word = new Word(text, format);
        words.add(word);
    }

    public void renderDocument() {
        for (Word word : words) {
            word.render();
        }
    }
}

