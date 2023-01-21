package b132practices.practice04nt;

import java.util.Locale;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        //Type a code to print its season after getting a month from the user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a month name");
        String month = in.next().toLowerCase();

        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            System.out.println("Spring");
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            System.out.println("Summer");
        } else if (month.equals("september") || month.equals("october") || month.equals("september") || month.equals("november")) {
            System.out.println("Autumn");
        } else if (month.equals("december") || month.equals("january") || month.equals("february")) {
            System.out.println("Winter");
        } else {
            System.out.println("invalid month");
        }


    }

}
