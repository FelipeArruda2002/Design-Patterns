package bankaccount;

public class BankAccount {
	private String accountHolderName;
	private double balance;
	private State state;

	public BankAccount(String accountHolderName) {
		this.accountHolderName = accountHolderName;
		this.balance = 0.0;
		this.state = new Active(this);
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getState() {
		 return state.getClass().getSimpleName();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void deposit(double amount) {
		state.deposit(amount);
	}

	public void withdraw(double amount) {
		state.withdraw(amount);
	}

	public void deactivate() {
		state.deactivate();
	}

	public void reactivate() {
		state.reactivate();
	}

	public void close() {
		state.close();
	}

}
