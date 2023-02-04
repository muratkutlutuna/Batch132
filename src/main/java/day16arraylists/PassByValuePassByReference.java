package day16arraylists;

import javax.swing.*;

public class PassByValuePassByReference {
    public static void main(String[] args) {

        /*
        1)PassByValue creates a copy of thge value and uses the copy in the method.
        That is why methods can change just the copy not original value.
        Java uses PassByValue to protect original values
        2)Some programming languages like C-Sharp use PassByReference.
        PassByReference creates the copy of the reference(address) and use the copy in the methods/
        Copy Reference and Ortiginal Reference point the original value that is why original is updated by the methods.
        I mean if you use PassByReference, you cannot protect original values.
         */
        int shirtPrice = 100;
        studentShirtPrice(shirtPrice, 19);
        System.out.println(shirtPrice);

        String name = "Ajda";
        String result = putExclamation(name);
        System.out.println("result = " + result);//Ajda
        System.out.println(name);

        //using a method inside the main method is called "Method call"
        double newSalary = increaseSalary(20000);
        System.out.println(newSalary);

        int abs = getAbsoluteValue(-5);
        System.out.println("abs = " + abs);

    }

    public static void studentShirtPrice(int shirtPrice, int discount) {
        int discountedPrice = shirtPrice - discount;
        System.out.println(discountedPrice);
    }

    public static String putExclamation(String name) {
        return name + "!";
    }

    //Create a method increases the salary 20 percent
    public static double increaseSalary(double salary){
        return salary * 1.2;
    }
    //Create a methdo calculate the absultet value of an integer
    // -5 ==> 5     -     5 ==> 5        -       0 ==> 0
    public static int getAbsoluteValue(int n){
        if (n < 0) {
            return -1 * n;
        } else {
            return n;
        }
    }

    //Create a method adds two integers
    public static String addTwoInts(String str, int first, int second){
        return str+first+second;
    }

    //Create a method print the first and the last character on the console
    public static void printFirstAndLast(String str) {
        if (str.length() < 2) {
            System.out.println("There is only one character on the String");
            System.out.println(str.substring(0));
        } else {
            System.out.println(str.substring(0, 1) + ", " + str.substring(str.length() - 2, str.length() - 1));
        }
    }

    //Creates a method prints the sum of ASCII values of characters in a String
    public static void printSumAscii(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }
        System.out.println("ASCII sum of the String "+str+" is "+sum);
    }


}
