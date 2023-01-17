package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Example 1: Type code to print integers from 4 to 7 on the console

        //1.Way: Use for-loop

        for (int i = 4; i <= 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2.Way: Use while-loop

        int i = 4;
        while (i <= 7) {
            System.out.print(i + " ");
            i++;
        }

        //Example 2: Type code to print "odd integers" from 12 to 67in the same line with a space between them
        int k = 12;
        while (k < 68) {
            if (k % 2 == 1) {
                System.out.print(k + " ");
            }
            k++;
        }
        System.out.println();


        //Example 3: Type code to find the sum of integers from 12 to 67
        int m = 12;

        int sum = 0;
        while (m < 68) {
            sum+=m;
            m++;
        }
        System.out.println("The sum of integers from 12 to 67 is: " + sum);

        //Example 4: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        int sumOfDigits = 0;

        while (n > 0) {
            sumOfDigits += n % 10;
            n /= 10;
        }
        System.out.println("The sum of digits of " + n + " is: " + sumOfDigits);

        /*
             Example 5:  Type java code by using while loop,
                         Write a program that prompts the user to input a number.
                         It should then print the multiplication table of that number.
                         3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
         */

        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n2 = in2.nextInt();

        int j = 1;
        while (j < 11) {
            System.out.print(n2 + "x" + j + "=" + (n2 * j) + " ");
            j++;
        }





    }
}
