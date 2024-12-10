package bankaccount;

public class BankAccount {
    private String accountHolderName;
    private double balance;
    private String state; // "ACTIVE", "INACTIVE", "CLOSED"

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.state = "ACTIVE";
    }

    public void deposit(double amount) {
        if ("ACTIVE".equals(state)) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. Current balance: $" + balance);
        } else {
            System.out.println("Cannot deposit into a non-active account.");
        }
    }

    public void withdraw(double amount) {
        if ("ACTIVE".equals(state)) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + balance);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Cannot withdraw from a non-active account.");
        }
    }

    public void deactivate() {
        if ("ACTIVE".equals(state)) {
            state = "INACTIVE";
            System.out.println("Account has been deactivated.");
        } else {
            System.out.println("Only active accounts can be deactivated.");
        }
    }

    public void reactivate() {
        if ("INACTIVE".equals(state)) {
            state = "ACTIVE";
            System.out.println("Account has been reactivated.");
        } else {
            System.out.println("Only inactive accounts can be reactivated.");
        }
    }

    public void close() {
        if (!"CLOSED".equals(state)) {
            state = "CLOSED";
            System.out.println("Account has been closed.");
        } else {
            System.out.println("Account is already closed.");
        }
    }

    public String getState() {
        return state;
    }
}
