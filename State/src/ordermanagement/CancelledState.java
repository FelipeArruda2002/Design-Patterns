package ordermanagement;

public class CancelledState extends AbstractState {

	public CancelledState(Order order) {
		super(order);
	}

	@Override
	public String getName() {
		return "Cancelled";
	}

}
