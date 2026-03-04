package ECommerceBackend;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Starting E-Commerce Application =====");

        // Product Catalog
        List<Product> productCatalog = new ArrayList<>();

        productCatalog.add(new Product(1, "DELL Laptop", 31000.00, 10));
        productCatalog.add(new Product(2, "Continental Coffee", 215.50, 50));
        productCatalog.add(new Product(3, "Wireless Mouse", 599.00, 25));
        productCatalog.add(new Product(4, "Keyboard", 899.00, 15));

        // User
        User user = new User("U001", "Sai", "sai@email.com");

        boolean running = true;

        while (running) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Product Catalog ---");
                    for (Product p : productCatalog) {
                        System.out.println(
                                p.getId() + " | " + p.getName() +
                                " | ₹" + p.getPrice() +
                                " | Stock: " + p.getQuantity());
                    }
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    boolean found = false;

                    for (Product p : productCatalog) {

                        if (p.getId() == id) {

                            if (p.getQuantity() > 0) {

                                user.getCart().additems(p);
                                p.setQuantity(p.getQuantity() - 1);

                            } else {
                                System.out.println("Product out of stock.");
                            }

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Invalid product ID.");
                    }

                    break;

                case 3:
                    System.out.println("\n--- Your Cart ---");
                    user.getCart().viewcart();
                    break;

                case 4:

                    System.out.println("\nProcessing checkout...");
                    user.getCart().viewcart();
                    System.out.println("Order placed successfully!");

                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}