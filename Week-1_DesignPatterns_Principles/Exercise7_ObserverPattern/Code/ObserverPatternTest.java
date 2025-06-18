public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stockMarket.register(mobile);
        stockMarket.register(web);

        stockMarket.setPrice(100.0);
        stockMarket.setPrice(110.5);

        stockMarket.deregister(mobile);
        stockMarket.setPrice(120.0);
    }
}