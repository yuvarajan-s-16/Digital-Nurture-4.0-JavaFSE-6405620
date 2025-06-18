public class WebApp implements Observer {
    @Override
    public void update(double price) {
        System.out.println("WebApp: New stock price: " + price);
    }
}