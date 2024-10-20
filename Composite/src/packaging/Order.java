package packaging;

import java.util.ArrayList;
import java.util.List;

public class  Order {
    private List<OrderItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (OrderItem item : items) {
        	total += item.getPrice();
        }
        return total;
    }

}