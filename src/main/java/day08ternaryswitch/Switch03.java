package day08ternaryswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*
        Create a simple calculator which does
        addition, subtraction, multiplication, division, percentage calculation
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        System.out.print("Enter another number: ");
        double otherNumber = input.nextDouble();
        System.out.print("Enter the calculation type as \"+\", \"-\", \"*\", \"/\", \"%\": ");
        String type = input.next();
        switch (type) {
            case "+":
                System.out.println("The sum is : " + (number + otherNumber));
                break;
            case "-":
                System.out.println("The difference is : " + (number - otherNumber));
                break;
            case "*":
                System.out.println("The multiplication is : " + (number * otherNumber));
                break;
            case "/":
                System.out.println("The division is : " + (number / otherNumber));
                break;
            case "%":
                System.out.println("The percentage is : " + ((number * otherNumber)/100));
                break;
            default:
                System.out.println("Invalid Input");
        }

        /*
            Note 1: Inside the switch paranthesis, you can use 1)int, 2)byte, 3)short, 4)char, 5)String
            Note 2: Inside the switch paranthesis, you CANNOT use 1)long, 2)float, 3)boolean, 4)double
         */

    }
}
