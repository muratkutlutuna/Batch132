package day08ternaryswitch;

public class Loops01 {
    public static void main(String[] args) {
        /*
            When we need to do "repeated actions" in Java, we use loops
         */

        //Example 1: Type "Hi!" 5000 times on the console

        //1.Way:
        //To do repeated actions, typing repeated code is not acceptable.
        //Because, repeated codes are not good at updating, fix, type
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2.Way: There are 4 loops in Java; 1)for-loop 2)while-loop 3)do-while-loop $)for-each-loop
        //    Starting Value     condition     Increment/Decrement
        for(    int i=1       ;    i<6        ;     i++             ){
            System.out.println("Hi!");
        }



    }
}
