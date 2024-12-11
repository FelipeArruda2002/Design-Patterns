package bankaccount;

public abstract class AbstractState implements State {

	protected BankAccount account;

	public AbstractState(BankAccount account) {
		this.account = account;
	}

}
