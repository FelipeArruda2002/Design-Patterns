package packaging;

import java.util.ArrayList;
import java.util.List;

public class  Order {
    private List<Object> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Object item) {
        this.items.add(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Object item : items) {
            if (item instanceof Product) {
                total += ((Product) item).getPrice();
            } else if (item instanceof Box) {
                total += calculateBoxPrice((Box) item);
            }
        }
        return total;
    }

    private double calculateBoxPrice(Box box) {
        double total = 0;
        for (Object item : box.getItems()) {
            if (item instanceof Product) {
                total += ((Product) item).getPrice();
            } else if (item instanceof Box) {
                total += calculateBoxPrice((Box) item); // Recursivamente soma o preço das caixas aninhadas
            }
        }
        return total;
    }
}