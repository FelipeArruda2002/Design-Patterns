package ordermanagement;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements OrderCollectionInterface<Order> {
    private List<Order> orders = new ArrayList<>();

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

	@Override
	public Iterator<Order> createIterator() {
		return new OrderIterator(this);
	}
}

