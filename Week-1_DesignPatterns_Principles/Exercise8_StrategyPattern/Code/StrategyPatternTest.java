public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.pay(500.0);

        context.setStrategy(new PayPalPayment());
        context.pay(200.0);
    }
}