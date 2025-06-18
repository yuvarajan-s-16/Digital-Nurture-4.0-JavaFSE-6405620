import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagementSystem {
    HashMap<Integer, Product> inventory = new HashMap<>();

    void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    void updateProduct(int id, int qty, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.quantity = qty;
            p.price = price;
        }
    }

    void deleteProduct(int id) {
        inventory.remove(id);
    }

    // Testing - main method
    public static void main(String[] args) {
        InventoryManagementSystem inv = new InventoryManagementSystem();

        System.out.println("Adding products...");
        inv.addProduct(new Product(1, "Laptop", 15, 1500.00));
        inv.addProduct(new Product(2, "Mouse", 100, 25.00));
        inv.addProduct(new Product(3, "Keyboard", 600, 75.00));

        System.out.println("\nCurrent Inventory:");
        for (Product p : inv.inventory.values()) {
            System.out.println(
                    "ID: " + p.productId + ", Name: " + p.productName + ", Qty: " + p.quantity + ", Price: " + p.price);
        }

        System.out.println("\nUpdating product with ID 2...");
        inv.updateProduct(2, 46, 29.50);

        System.out.println("\nInventory after update:");
        for (Product p : inv.inventory.values()) {
            System.out.println(
                    "ID: " + p.productId + ", Name: " + p.productName + ", Qty: " + p.quantity + ", Price: " + p.price);
        }

        System.out.println("\nDeleting product with ID 1...");
        inv.deleteProduct(1);

        System.out.println("\nFinal Inventory:");
        for (Product p : inv.inventory.values()) {
            System.out.println(
                    "ID: " + p.productId + ", Name: " + p.productName + ", Qty: " + p.quantity + ", Price: " + p.price);
        }
    }
}