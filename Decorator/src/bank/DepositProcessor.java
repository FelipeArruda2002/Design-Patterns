package bank;

public class DepositProcessor implements TransactionProcessor {

	private Double amount;
	
	public DepositProcessor(Double amount) {
		this.amount = amount;
	}


	public void process() {
		System.out.printf("Deposit made in the amount of R$%.2f", amount);
	}

}
