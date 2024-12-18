package ordermanagement;

public class PaidState extends AbstractState {

	public PaidState(Order order) {
		super(order);
	}

	@Override
	public void cancel() {
		System.out.println("Order " + order.getOrderId() + " has been cancelled.");
		order.setState(new CancelledState(order));
	}

	@Override
	public void ship() {
		System.out.println("Order " + order.getOrderId() + " has been shipped.");
		order.setState(new ShippedState(order));
	}
	
	@Override
	public String getName() {
		return "Paid";
	}

}
