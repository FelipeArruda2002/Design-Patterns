package packaging;

import java.util.ArrayList;
import java.util.List;

public class Box implements OrderItem {
    private List<OrderItem> items; // Pode conter produtos ou outras caixas

    public Box() {
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public List<OrderItem> getItems() {
        return this.items;
    }

	@Override
	public double getPrice() {
		double total = 0;
		for (OrderItem item: items) {
			total += item.getPrice();
		}
		return total;
	}
	
}