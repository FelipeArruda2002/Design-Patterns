package payment.service;

import payment.service.lib.ExternalPaymentSystem;

public class AdapterPayment implements Payment {
	
	private ExternalPaymentSystem externalPaymentSystem; 

	public AdapterPayment(ExternalPaymentSystem externalPaymentSystem) {
		this.externalPaymentSystem = externalPaymentSystem;
	}

	@Override
	public void processPayment(double valor) {
		externalPaymentSystem.makePayment(valor);
	}

}
