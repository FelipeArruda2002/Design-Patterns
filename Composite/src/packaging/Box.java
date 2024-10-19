package packaging;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Object> items; // Pode conter produtos ou outras caixas

    public Box() {
        this.items = new ArrayList<>();
    }

    public void addItem(Object item) {
        this.items.add(item);
    }

    public List<Object> getItems() {
        return this.items;
    }
}