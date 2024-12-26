package payment;

public class BankSlip implements PaymentStrategy {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing boleto payment of R$ " + amount);
	}

}
