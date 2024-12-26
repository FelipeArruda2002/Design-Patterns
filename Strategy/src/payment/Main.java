package payment;


public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor("PIX");
        processor.processPayment(150.00);

        processor = new PaymentProcessor("CREDIT_CARD");
        processor.processPayment(350.00);

        processor = new PaymentProcessor("BOLETO");
        processor.processPayment(200.00);
    }
}
