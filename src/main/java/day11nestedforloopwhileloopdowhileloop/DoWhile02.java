package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        /*
             Username is "admin", Password is "pwd123"
             Ask user to enter username and password
             User should see "Enter your username and password" message
             If he enters correct credentials he should get "You are in your account!" message
             Otherwise, he should see "Enter your username and password" message 3 times
             After 3 times he should get "Your account is blocked" message
        */
        String username = "admin";
        String password = "pwd123";
        int count = 0;
        Scanner in = new Scanner(System.in);
        String usernameInput = "";
        String passwordInput = "";

        do {
            System.out.println("Enter your username and password");
            System.out.println("Username: ");
            usernameInput = in.nextLine();
            System.out.println("Password: ");
            passwordInput = in.nextLine();

            if (passwordInput.equals(password) && usernameInput.equals(username)) {
                break;
            }

            count++;

            System.out.println("You have "+(3-count)+" right left to use as a credentials!!");

            if (count == 3) {
                System.out.println("Your account is blocked");
            }
        } while (count < 3);

        System.out.println("Credentials are successful");
    }
}
