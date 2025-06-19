import java.util.*;

public class ProductSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search (array must be sorted)
    public static Product binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) return products[mid];
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Book", "Stationery"),
            new Product(4, "Camera", "Electronics"),
            new Product(5, "Bag", "Travel")
        };

        // Linear Search Example
        System.out.println("Linear Search:");
        Product found = linearSearch(products, "Book");
        System.out.println(found != null ? found : "Product not found");

        // Binary Search needs sorted array by name
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        System.out.println("\nBinary Search:");
        Product foundBin = binarySearch(products, "Camera");
        System.out.println(foundBin != null ? foundBin : "Product not found");
    }
}
