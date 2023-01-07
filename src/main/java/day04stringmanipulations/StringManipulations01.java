package day04stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Get the full name of the user and make all characters in upper cases
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and the last name...");
        String fullName = input.nextLine();
        System.out.println("Your full name is " + fullName.toUpperCase());
        //Example 2: Get the full name of the user and makeall characters in uper cases, and remove spaces
        //           from the beginning and from the end
        System.out.println("Enter your first and the last name...");
        String name  = input.nextLine().toUpperCase().trim();

        //trim() method removes the "space" characters from the beginning and from the end
        //trim() method does  not touch spaces in the middle
        System.out.println(name);

        //Example 3: Get a string from a user, then count the number of characters in the String
        System.out.println("Enter a String...");
        String s = input.nextLine();

        int numOfChars = s.length();

        //length() method gives you the number of characters in a String
        System.out.println(numOfChars);




    }

}
