package bank.decorator;

import bank.TransactionProcessor;

public class TwoFactorAuthDecorator extends AbstractDecorator {

	public TwoFactorAuthDecorator(TransactionProcessor transaction) {
		super(transaction);
	}

	@Override
	public void process() {
		if (authenticate()) {
			super.process();
		} else {
			System.out.println("Authentication failed.");
		}
	}

	private boolean authenticate() {
		System.out.println("Authenticating via SMS...");
		return Math.random() > 0.5; 
	}

}
