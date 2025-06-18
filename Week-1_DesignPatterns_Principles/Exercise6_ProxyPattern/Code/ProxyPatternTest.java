public class ProxyPatternTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("img1.jpg");
        Image img2 = new ProxyImage("img2.jpg");
        img1.display(); // Loads and displays
        img1.display(); // Only displays
        img2.display(); // Loads and displays
        img2.display(); // Only displays
    }
}