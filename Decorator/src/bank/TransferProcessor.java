package bank;

public class TransferProcessor implements TransactionProcessor {

	private Double amount;
	
	public TransferProcessor(Double amount) {
		this.amount = amount;
	}


	public void process() {
		System.out.printf("Transfer made in the amount of R$%.2f", amount);
	}

}
