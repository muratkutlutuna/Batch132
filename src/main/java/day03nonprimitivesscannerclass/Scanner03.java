package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Example 1: Ask user to enter width and the length of a rectangle, then calculate
        //perimeter and the area of the rectangle.
        System.out.println("Enter width and length of a rectangle:");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int length = sc.nextInt();
        double perimeter = width * 2 + length * 2;
        System.out.println("perimeter = " + perimeter);

    }

}
