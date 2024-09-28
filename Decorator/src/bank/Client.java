package bank;

import bank.decorator.LimitValidationDecorator;
import bank.decorator.TwoFactorAuthDecorator;

public class Client {

	public static void main(String[] args) {
		TransactionProcessor transfer =  new TwoFactorAuthDecorator(new TransferProcessor(5000.00));
		transfer.process();
		
		TransactionProcessor deposit = new LimitValidationDecorator(new DepositProcessor(5000.00), 5000.00);
		deposit.process();
		
		TransactionProcessor payment = new TwoFactorAuthDecorator(new LimitValidationDecorator(new PaymentProcessor(500.00), 500.00));
		payment.process();
	}

}
