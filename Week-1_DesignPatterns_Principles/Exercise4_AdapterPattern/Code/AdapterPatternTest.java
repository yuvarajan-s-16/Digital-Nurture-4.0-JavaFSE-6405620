public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());

        stripeProcessor.processPayment(120.0);
        paypalProcessor.processPayment(75.5);
    }
}