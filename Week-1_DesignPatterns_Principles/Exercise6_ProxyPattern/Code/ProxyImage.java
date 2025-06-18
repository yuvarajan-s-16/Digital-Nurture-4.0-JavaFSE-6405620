import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image {
    private String filename;
    private static Map<String, RealImage> cache = new HashMap<>();

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        RealImage realImage = cache.get(filename);
        if (realImage == null) {
            realImage = new RealImage(filename);
            cache.put(filename, realImage);
        }
        realImage.display();
    }
}