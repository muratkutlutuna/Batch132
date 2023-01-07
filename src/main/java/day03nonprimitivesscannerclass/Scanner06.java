package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Example 1: Ask user to enter his first and the last name and address then print them on the console.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();
        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.println(firstName + " " + lastName);
        System.out.println("address = " + address);

    }
}
