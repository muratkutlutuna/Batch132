package day04stringmanipulations;

public class StringManipulations03 {

    public static void main(String[] args) {

        //Example 1: Check the password if it has given rules.
        //           i)It should start with "J"
        //           ii)It should have at least 8 characters
        //           iii)Last 3 characters should be "AVA"

        String pwd = "J12!?AVA";

        //i)It should start with "J"
        boolean first = pwd.startsWith("J");
        System.out.println("First rule: " +first);

        //ii)It should have at least 8 characters
        boolean second = pwd.length() >= 8;
        System.out.println("Second rule: " +second);

        //iii)Last 3 characters should be "AVA"
        boolean third = pwd.substring(pwd.length() - 3).equals("AVA");
        System.out.println("Third rule: " +third);

        System.out.println(first);

    }

}
