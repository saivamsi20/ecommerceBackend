package ECommerceBackend;

public class Main {    
    public static void main(String[] args) {
        System.out.println("\nStarting E-Commerce Application...");

        // 1. Create some products
        product laptop = new product(001, "Developer Laptop", 1200.00, 10);
        product coffee = new product(002, "Premium Coffee Beans", 15.50, 50);

        // 2. Create a user
        User testUser = new User("U001", "Vamsi", "vamsi@example.com");

        // 3. User adds items to their cart
        System.out.println("\nShopping Log for " + testUser.getUserName() + ":");
        testUser.getCart().additems(laptop);
        testUser.getCart().additems(coffee);

        // 4. View the cart
        testUser.getCart().viewcart();
    }
}
