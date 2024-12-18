package ordermanagement;

public class Order {
	private String orderId;
	private State state;

	public Order(String orderId) {
		this.orderId = orderId;
		this.state = new CreatedState(this);
	}

	public String getOrderId() {
		return orderId;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void pay() {
		state.pay();
	}

	public void cancel() {
		state.cancel();
	}

	public void ship() {
		state.ship();
	}

	public void complete() {
		state.complete();
	}
}
