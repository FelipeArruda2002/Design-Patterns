package payment;

public class Pix implements PaymentStrategy {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing PIX payment of R$ " + amount);
	}

}
