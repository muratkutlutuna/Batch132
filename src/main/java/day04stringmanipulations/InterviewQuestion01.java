package day04stringmanipulations;

public class InterviewQuestion01 {

    public static void main(String[] args) {

        //Example 1: Type to swap the integers
        //           a=12 and b=5 ==> a=5 and b=12

        //1.Way: By using 3rd value
        int a = 12;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + ", b = " + b);


        //2.Way: Without using 3rd value
        int c = 12;
        int d = 5;
        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("c = " + c + ", d = " + d);

    }

}
