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

        /*
        What did we learn today:
        1)charAt() ==> char
        2)toUpperCase() ==> String
        3)toLowerCase() ==> String
        4)trim() ==> String
        5)split() ==> We will learn it later.
        6)length() ==> int
        7)substring(beginning Index, Ending Index) ==> String
        8)substring(beginning Index) ==> String
        9)equals() ==> boolean
        10)equalsIgnoreCase() ==> boolean
        11)startsWith() ==> boolean

        Note: when you learn in java you should learn
            1)What does the method do?
            2)What are the different usages?
            3)What does the method give you?
         */
    }

}
