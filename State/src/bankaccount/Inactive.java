package bankaccount;

/**
 * Conta Inativa: Permite apenas reativação.
 */
public class Inactive extends AbstractState {

	public Inactive(BankAccount account) {
		super(account);
	}

	@Override
	public void deposit(double amount) {
		System.out.println("Cannot deposit into a non-active account.");
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Cannot withdraw from a non-active account.");
	}

	@Override
	public void deactivate() {
		System.out.println("Account is already inactive.");
	}

	@Override
	public void reactivate() {
		account.setState(new Active(account));
		System.out.println("Account has been reactivated.");
	}

	@Override
	public void close() {
		System.out.println("Account has been closed.");
		account.setState(new Closed(account));
	}

}
