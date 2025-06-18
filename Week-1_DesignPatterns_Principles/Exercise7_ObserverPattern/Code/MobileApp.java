public class MobileApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("MobileApp: New stock price: " + price);
    }
}