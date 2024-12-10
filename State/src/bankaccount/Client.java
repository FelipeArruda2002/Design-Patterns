package bankaccount;

public class Client {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe");

        System.out.println("Initial account state: " + account.getState());

        // Test deposit
        account.deposit(100.0);

        // Test withdraw
        account.withdraw(50.0);

        // Test deactivate
        account.deactivate();
        account.deposit(50.0); // Should not be allowed
        account.reactivate();

        // Test withdraw after reactivation
        account.withdraw(30.0);

        // Test close account
        account.close();
        account.withdraw(20.0); // Should not be allowed
        account.deposit(20.0);  // Should not be allowed
        account.reactivate();  // Should not be allowed
    }
}
