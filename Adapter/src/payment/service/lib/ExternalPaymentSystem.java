package payment.service.lib;

/**
 * Adaptee
 * Classe externa onde não tenho permissão de edição(Classes de bibliotecas) 
 */
public class ExternalPaymentSystem {

	public void makePayment(double amount) {
		System.out.println(String.format("Pagamento realizado no valor de R$ %s ", amount));
	}
	
}
