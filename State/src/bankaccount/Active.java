package bankaccount;

/**
 * Conta Ativa: Permite depósitos e saques.
 */
public class Active extends AbstractState {
	
	public Active(BankAccount account) {
		super(account);
	}

	@Override
	public void deposit(double amount) {
		double balance = account.getBalance();
		account.setBalance(balance + amount);
		System.out.println("Deposit of $" + amount + " successful. Current balance: $" + balance);
	}

	@Override
	public void withdraw(double amount) {
		double balance = account.getBalance();
		if (amount <= balance) {
			account.setBalance(balance - amount);
			System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + balance);
		} else {
			System.out.println("Insufficient balance for withdrawal.");
		}
	}

	@Override
	public void deactivate() {
		 System.out.println("Account has been deactivated.");
		 account.setState(new Inactive(account));
	}

	@Override
	public void reactivate() {
		  System.out.println("Account is already active.");
	}

	@Override
	public void close() {
	    System.out.println("Account has been closed.");
        account.setState(new Closed(account));
	}

}
