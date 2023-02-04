package day17methodoverloadingdatetimeclasses;

public class MethodOverloading01 {
    public static void main(String[] args) {

        /*
            1)If you create methods with i)the saame name and ii)different parameters, it means you created "method overloading"
            2)If you make method names and the parameters same in two different methods Java complains because
              if the names and the parameterd are same, Java accepts the method s exactly same.
              Typing same methods repeatedly cannot be accepted by Java
            3)Java checks just the "method name" and "parametes" to understand if the methods are same or not
              "method name" and "parametes" are called "method signature"
            4)How can we make the parameters different?
                 i)Use different data types for the parameters
                 ii)If data types are different, you can change the order of the parameters
                 iii)Change the number of parameters
            5)Access Modifiers di not take any role in "method overloading", that is why methods in any access modifier can be overloaded
            5)To be static or non-static does not affect "method overloading", that is why static or non-static methods
            can be overloaded
         */

        multiply(3, 5);
        multiply(3, 3.2);
        multiply(3.2, 3);

    }
    //Create a method mutiplies two integers
    public static int multiply(int a, int b) {
        return a * b;
    }
    //Create a method mutiplies one double one integer
    public static double multiply(double a, int b) {
        return a * b;
    }
    //Create a method mutiplies one integer one double
    public static double multiply(int a, double b) {
        return a * b;
    }
    //Create a method multiplies three integers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
