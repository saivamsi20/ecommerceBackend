package ECommerceBackend;

public class Main {    
    public static void main(String[] args) {
        System.out.println("\nStarting E-Commerce Application...");

        Product laptop = new Product(001, "DELL", 31000.00, 10);
        Product coffee = new Product(002, "continental", 215.50, 50);

        User testUser = new User("U001", "UserName", "User@example.com");

        System.out.println("\nShopping Log for " + testUser.getUserName() + ":");
        testUser.getCart().additems(laptop);
        testUser.getCart().additems(coffee);

    }
}
