package ordermanagement;

public class CompletedState extends AbstractState {

	public CompletedState(Order order) {
		super(order);
	}

	@Override
	public String getName() {
		return "Completed";
	}
}
