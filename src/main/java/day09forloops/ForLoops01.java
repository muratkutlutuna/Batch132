package day09forloops;

public class ForLoops01 {
    public static void main(String[] args) {

        //Example 1: Type all integers from 11 to 44 in the same line
        //           with a space between consecutive integers
        //           11 12 13 14 ... 44

        for (int i = 11; i < 45; i = i + 1) {
            System.out.print(i + " ");
        }

        //Example 2: Type even integers from 11 to 44 in the same line
        //           with a space between consecutive integers
        //           12 14 ... 44

        System.out.println();
        for (int i = 12; i < 45; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 11; i < 45; i = i + 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //Example 3: Type odd integers from 68 to 13 in the same line
        //           with a space between consecutive integers

        System.out.println();
        System.out.println();
        for (int i = 68; i > 13; i = i - 1) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Example 4: Type code to print the letters from 'c' to 'u'
        //           c d e f ... u
        for (char i = 'c'; i <= 'u'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Example 5: Type code to print integers from 0 to 100
        //           without using any number in your code

        for (int i = 'a' - 'a'; i < 'e'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
         /*
            We can use "int" as data type for char data
            If you use "char" as data type for "char"s Java gives you the character
            If you use "int" as data type for "char"s Java gives you the ASCII value of the char
         */
        char ch = 'm';
        System.out.println(ch);// m

        int dh = 'm';
        System.out.println(dh);// 109

    }
}
