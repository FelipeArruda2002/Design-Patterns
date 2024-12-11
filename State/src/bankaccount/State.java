package bankaccount;

public interface State {

	public void deposit(double amount);

	public void withdraw(double amount);

	public void deactivate();

	public void reactivate();

	public void close();

}
