package payment;

public class PaymentProcessor {
    private String paymentType;

    public PaymentProcessor(String paymentType) {
        this.paymentType = paymentType;
    }

    public void processPayment(double amount) {
        if ("BOLETO".equalsIgnoreCase(paymentType)) {
            System.out.println("Processing boleto payment of R$ " + amount);
        } else if ("CREDIT_CARD".equalsIgnoreCase(paymentType)) {
            System.out.println("Processing credit card payment of R$ " + amount);
        } else if ("PIX".equalsIgnoreCase(paymentType)) {
            System.out.println("Processing PIX payment of R$ " + amount);
        } else {
            System.out.println("Invalid payment type.");
        }
    }
}
