package bank;

public class PaymentProcessor implements TransactionProcessor {

	private Double amount;
	
	public PaymentProcessor(Double amount) {
		this.amount = amount;
	}


	public void process() {
		System.out.printf("Payment made in the amount of R$%.2f", amount);
	}

}
