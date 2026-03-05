package ECommerceBackend;

import java.util.HashMap;
import java.util.Map;

public class AuthService {

    private Map<String, String> users = new HashMap<>();

    // Register new user
    public void register(String email, String password) {

        if(users.containsKey(email)){
            System.out.println("User already exists!");
            return;
        }

        users.put(email, password);
        System.out.println("Registration successful!");
    }

    // Login
    public boolean login(String email, String password){

        if(!users.containsKey(email)){
            System.out.println("User not found.");
            return false;
        }

        String storedPassword = users.get(email);

        if(storedPassword.equals(password)){
            System.out.println("Login successful!");
            return true;
        }

        System.out.println("Invalid password.");
        return false;
    }
}