package ECommerceBackend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AuthService auth = new AuthService();

        // Product catalog (simulating database)
        List<Product> productCatalog = new ArrayList<>();

        productCatalog.add(new Product(1, "DELL Laptop", 31000.00, 10));
        productCatalog.add(new Product(2, "Continental Coffee", 215.50, 50));
        productCatalog.add(new Product(3, "Wireless Mouse", 599.00, 25));
        productCatalog.add(new Product(4, "Mechanical Keyboard", 1899.00, 15));

        boolean appRunning = true;

        System.out.println("===== E-Commerce Application Started =====");

        while (appRunning) {

            System.out.println("\n===== AUTH MENU =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    auth.register(email, password);

                    break;

                case 2:

                    System.out.print("Enter email: ");
                    email = sc.nextLine();

                    System.out.print("Enter password: ");
                    password = sc.nextLine();

                    boolean loggedIn = auth.login(email, password);

                    if (loggedIn) {

                        System.out.println("\nLogin successful!");

                        User user = new User("U001", email, email);

                        boolean shopping = true;

                        while (shopping) {

                            System.out.println("\n===== SHOP MENU =====");
                            System.out.println("1. View Products");
                            System.out.println("2. Add Product to Cart");
                            System.out.println("3. View Cart");
                            System.out.println("4. Checkout");
                            System.out.println("5. Logout");

                            System.out.print("Enter choice: ");
                            int shopChoice = sc.nextInt();

                            switch (shopChoice) {

                                case 1:

                                    System.out.println("\n--- Product Catalog ---");

                                    for (Product p : productCatalog) {
                                        System.out.println(
                                                p.getId() + " | "
                                                        + p.getName() + " | ₹"
                                                        + p.getPrice() + " | Stock: "
                                                        + p.getQuantity());
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
                                        System.out.println("Invalid Product ID.");
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

                                    shopping = false;
                                    System.out.println("Logged out.");

                                    break;

                                default:
                                    System.out.println("Invalid option.");
                            }
                        }
                    }

                    break;

                case 3:

                    appRunning = false;
                    System.out.println("Exiting application...");

                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}