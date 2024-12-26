package payment;


public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(new Pix());
        processor.processPayment(150.00);

        processor = new PaymentProcessor(new CreditCard());
        processor.processPayment(350.00);

        processor = new PaymentProcessor(new BankSlip());
        processor.processPayment(200.00);
    }
}
