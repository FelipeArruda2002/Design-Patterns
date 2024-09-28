package bank.decorator;

import bank.TransactionProcessor;

public class LimitValidationDecorator extends AbstractDecorator {

	private Double amount;

	public LimitValidationDecorator(TransactionProcessor transaction, Double amount) {
		super(transaction);
		this.amount = amount;
	}

	@Override
	public void process() {
		if (validateLimit()) {
			super.process();
		} else {
			System.out.println("Transaction exceeds the limit.");
		}
	}

	private boolean validateLimit() {
		 double limit = 5000.00;
		System.out.println("Validating transaction amount: " + amount);
		return amount <= limit;
	}

}
