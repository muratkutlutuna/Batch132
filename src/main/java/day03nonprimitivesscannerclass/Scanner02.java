package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Example 1: Get shirtPrice and shoePrice from user and print the total price on the console
        Scanner input = new Scanner(System.in);
        System.out.println("Give me shirt price: ");
        int shirtPrice = input.nextInt();
        System.out.println("Give me shoes price: ");
        int shoePrice = input.nextInt();
        int totalPrice = shirtPrice + shoePrice;
        System.out.println("Total price: " + totalPrice);


    }


}
