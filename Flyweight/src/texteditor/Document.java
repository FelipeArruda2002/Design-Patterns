package texteditor;

import java.util.ArrayList;
import java.util.List;

public class Document {
	
    private List<Word> words = new ArrayList<>();

    public void addWord(String text, TextFormat textFormat) {
        Word word = new Word(text, textFormat);
        words.add(word);
    }

    public void renderDocument() {
        for (Word word : words) {
            word.render();
        }
    }
}

