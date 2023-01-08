package b132practices.practice02;

import java.util.Scanner;

public class Q02 {

    /*
    Modulus operator ==> in Java % is called modulus operator
    It returns the "remainder" in a division operation
    13/5==>2 ==> 13%5==>3

     */
    public static void main(String[] args) {

        //Ask user to enter an integer then print "Even" on the console if the number is even.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int number = input.nextInt();

        System.out.println("Is the number even?: "+(number%2==0));

        boolean checkedNum = number%2==0;

        System.out.println("Is the number even? : "+checkedNum);

        //Check a number if it is odd or not
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter an digit to check if it is an odd number: ");

        int checkOdd = input2.nextInt();

        System.out.println("Is the number odd? : "+(checkOdd%2!=0));


    }

}
