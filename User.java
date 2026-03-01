package ECommerceBackend;

public class User {
    private String userId;
    private String userName;
    private String emailId;
    private Cart cart;


    public User(String userId, String userName, String emailId) {
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
            this.cart = new Cart();
    }

    public String getUserName() {
        return userName;
    }
    public Cart getCart() {
        return cart;
    }

    
}
