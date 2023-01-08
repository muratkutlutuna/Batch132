package day05stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: Delete all "a"s from, a given String
        String s = "Everything is easy if you study";

        String s1 = s.replace("y", "");
        System.out.println("s1 = " + s1);

        //Example 2: Delete all digits(0,1,2,3,4,5,6,7,8,9) from, a given String
        //Note: Just a Single digit is a data, all digits are a group of data
        //      To tell Java sth about a group of data we use "Regular Expressions"(Regex)
        String t = "Tom is 13 years old, and his GPA is 3.98";
        String t1 = t.replaceAll("[0-9]", "");//t.replaceAll("\\d", "");
        System.out.println("t1 = " + t1);//t1 = Tom is  years old, and his GPA is .

        /*
                What is the regex?
                1)All digits ==> [0-9]
                2)All lowercase letters ==> [a-z]
                3)All uppercase letters ==> [A-Z]
                4)All letters ==> [a-zA-Z]
                5)All non-alphanumeric characters ==> [^a-zA-Z0-9
                6)All vowels ==> [aeiouAEIOU]
                7)All punctuation marks ==> \\p{Punct}

                8)All characters "different from"(^) digits ==> [^0-9]
                9)All characters "different from"(^) lowercase letters ==> [^a-z]
                10)All characters "different from"(^) letters ==> [^a-zA-Z]
                11)All characters "different from"(^) vowels ==> [^aeiouAEIOU]

         */

        //Example 3: Delete all vowels from given String
        String u = "Tom, are you here?";
        String u1 = u.replaceAll("[aeiouAEIOU]", "");
        System.out.println("u1 = " + u1);//u1 = Tm, r y hr?

        //Example 4: Count how many digits are there in a String
        String n = "Tom is 13 years old, and his GPA is 3.98";

        int n1 = n.replaceAll("[^0-9]", "").length();
        System.out.println("There are this amount of digits in the respective String = " + n1);

        //Example 5: Check the user's password according to the given rules
        //           i)Password should have at least 8 characters
        //           ii)Password should not have a "space" character
        //           iiI)Password should have at least 1 upper case
        //           iv)Password should have at least 1 lower case
        //           v)Password should have at least 1 symbol
        //           vi)Password should have at least 1 digit

        String pwd = "As1?fdes3";

        //           i)Password should have at least 8 characters
        boolean firstRule = pwd.length()>7;
        System.out.println("firstRule = " + firstRule);
        //           ii)Password should not have a "space" character
        boolean secondRule = !pwd.contains(" ");
        secondRule = pwd.replaceAll("[^ ]", "").length() == 0;
        System.out.println("secondRule = " + secondRule);
        //           iiI)Password should have at least 1 upper case
        boolean thirdRule = pwd.toLowerCase()!=pwd;
        thirdRule = pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println("thirdRule = " + thirdRule);
        //           iv)Password should have at least 1 lower case
        boolean fourthRule = pwd.toUpperCase()!=pwd;
        fourthRule = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("fourthRule = " + fourthRule);
        //           v)Password should have at least 1 symbol(Not letter, not digit)
        boolean fifthRule = pwd.replaceAll("[^A-Za-z0-9]", "").length()>0;
        System.out.println("fifthRule = " + fifthRule);
        //           vi)Password should have at least 1 digit
        boolean sixthRule = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println("sixthRule = " + sixthRule);

    }


}





















