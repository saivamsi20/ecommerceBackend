package ECommerceBackend;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AuthService auth = new AuthService();

        boolean running = true;

        while(running){

            System.out.println("\n===== AUTH MENU =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

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

                    if(loggedIn){
                        System.out.println("Welcome to the store!");
                    }

                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }

        sc.close();
    }
}