package bankaccount;

public class Closed extends AbstractState {

    public Closed(BankAccount account) {
        super(account);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Cannot deposit into a closed account.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from a closed account.");
    }

    @Override
    public void deactivate() {
        System.out.println("A closed account cannot be deactivated.");
    }

    @Override
    public void reactivate() {
        System.out.println("A closed account cannot be reactivated.");
    }

    @Override
    public void close() {
        System.out.println("Account is already closed.");
    }
}
