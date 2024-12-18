package ordermanagement;

public class ShippedState extends AbstractState {

	public ShippedState(Order order) {
		super(order);
	}

	@Override
	public void complete() {
		System.out.println("Order " + order.getOrderId() + " has been completed.");
		order.setState(new CompletedState(order));
	}
	
	@Override
	public String getName() {
		return "Shipped";
	}

}
