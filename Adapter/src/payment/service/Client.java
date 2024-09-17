package payment.service;

import payment.service.lib.ExternalPaymentSystem;

public class Client {

	public static void main(String[] args) {
		Payment	paymentService = new AdapterPayment(new ExternalPaymentSystem());
		paymentService.processPayment(100);
	}

}
