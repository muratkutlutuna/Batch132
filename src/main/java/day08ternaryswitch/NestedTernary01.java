package day08ternaryswitch;

public class NestedTernary01 {

    public static void main(String[] args) {
        /*
            Type java code by using nested ternary.
            Write a program to check iif a year is "leap year" or not.
            1)If the year is divisible by 100 then it must be divisible by 400, ==>1600+    1800
            2)If a year is not divisible by 100 then it must be divisible by 4. ==>2004+    1997-
         */
        int year = 1600;
        String r1 = year%100==0?(year%400==0?"Leap":"Not Leap"):(year%4==0?"Leap":"Not Leap");
        System.out.println("Is the year leap year? "+r1);

        /*
        Type code to check the password
        If it has more than 8 characters, initial should be ‘i’
        If it has no more than 8 characters initial should be ‘K’
        Solve the task by using nested-ternary
         */
        String pwd = "ia1b3csss";

        String r2 = pwd.length() > 8 ? (pwd.charAt(0) == 'i' ? "pass" : "fail") : (pwd.charAt(0) == 'K' ? "pass" : "fail");
        System.out.println(r2);

    }

}
