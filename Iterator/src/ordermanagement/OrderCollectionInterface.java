package ordermanagement;

import java.util.List;

public interface OrderCollectionInterface<T> {

	void addOrder(T order);
	List<T> getOrders();
	Iterator<T> createIterator();
	
}
