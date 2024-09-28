package bank.decorator;

import bank.TransactionProcessor;

public abstract class AbstractDecorator implements TransactionProcessor {
	
	protected TransactionProcessor transaction;

	public AbstractDecorator(TransactionProcessor transaction) {
		this.transaction = transaction;
	}
	
	@Override
	public void process() {
		transaction.process();
	}

}
