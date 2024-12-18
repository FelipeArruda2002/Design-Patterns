package ordermanagement;

public abstract class AbstractState implements State {

	protected Order order;

	public AbstractState(Order order) {
		this.order = order;	
	}

	public void pay() {
		System.out.println("Cannot pay order in state: " + getName());
	}

	@Override
	public void complete() {
		System.out.println("Cannot complete order in state: " + getName());
	}

	@Override
	public void ship() {
		System.out.println("Cannot ship order in state: " + getName());
	}

	@Override
	public void cancel() {
		System.out.println("Cannot cancel order in state: " + getName());
	}

}
