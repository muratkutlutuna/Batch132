package day10forloop;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: Type code to calculate the multiplication of integers from 3 to 6
        //           3*4*5*6 ==> 360

        int multiplication = 1;

        for (int i = 3; i <= 6; i++) {
            multiplication *= i;
        }

        System.out.println(multiplication);//360

        //Example 2: Type code to find the sum of the digits in a given integer
        //           578 ==> 5+7+8=20

        int num = 578;

        num = Math.abs(num);//To make my code work with negative values, I used "Math.abs()"

        int sum = 0;

        for (int i = 578; i > 0; i /= 10) {
            sum += i % 10;
        }

        System.out.println(sum);//20

        /*
        Note 1: If you want to get the last digit of an integer use "number%10"
        Note 2: If all numbers are Integers in a mathematical operation, the result will be in "Integer" data type.
                If the result is in decimal data type, Java converts the decimal to Integer by removing the decimal part.
                Java does not do "rounding operation" to convert decimals ti integers
                57/10 ==> 5
        Note 3: If you use different data types in mathematical operations, the result will be in the largest data type
                12/5.0 ==> 2.4
                57.0/10 ==> 5.7
                57/10.0 ==> 5.7
                57.0/10.0 ==> 5.7
         */

        //Example 3: Type code to check if a String is "palindrome" or not
        //           anna, civic, 1234321 is palindrome

        String str = "anna";

        //1.Step: Find the reverse of the String
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            reverse += ch;
        }
        System.out.println(reverse);

        //2.Step: Compare the String with the reverse the decide if it is "Palindrome" or not
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }



    }
}
