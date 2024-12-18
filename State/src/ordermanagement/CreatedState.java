package ordermanagement;

public class CreatedState extends AbstractState {

	public CreatedState(Order order) {
		super(order);
	}

	@Override
	public void pay() {
		System.out.println("Order " + order.getOrderId() + " has been paid.");
		order.setState(new PaidState(order));
	}

	@Override
	public void cancel() {
		System.out.println("Order " + order.getOrderId() + " has been cancelled.");
		order.setState(new CancelledState(order));
	}

	@Override
	public String getName() {
		return "Created";
	}

}
