// prodct class 
class Product {
    int productId;
    String productName, category;

    // constructor for make new product
    Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}

public class EcommerceSearch {
    // this is a linear search function
    // it checks every product one by one
    static int linearSearch(Product[] arr, String name) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].productName.equals(name))
                return i; // found it
        return -1; // not found
    }

    // this is a binary search function
    // it needs the array to be sorted by product name
    static int binarySearch(Product[] arr, String name) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2; // find middle
            int cmp = arr[m].productName.compareTo(name);
            if (cmp == 0)
                return m; // found it
            else if (cmp < 0)
                l = m + 1; // search in right half
            else
                r = m - 1; // search in left half
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        // make an array of products
        Product[] arr = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Mobile", "Electronics"),
                new Product(3, "Pen", "Stationery"),
                new Product(4, "Shoes", "Fashion")
        };
        // for binarySearch, we need to sort the array first.
        // but here we assume its sorted for the example.
        // Test linear search
        System.out.println(linearSearch(arr, "Pen"));
        // Test binary search
        System.out.println(binarySearch(arr, "Shoes"));
    }
}