package day02typecastingScanner;

/**
 * The type Type casting 01.
 */
public class TypeCasting01 {

    //Example1: Create 2 integer variables and 1 String variables.
    /*
    Java creates primitive data types ==> byte< short< int< long< float< double -- char and boolean

    Non-Primitive fata types have both values and methods.
     */

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int a = 13;
        int b =15;
        String name = "Tommy";
        String fullName = "Tom Hanks";
        System.out.println(fullName+a+b);

        System.out.println(name+(a+b));

        //Type Casting
        /*
        1)AutoWidening = Java can put small data types into larger data types automatically
        when you put a small data type into
         */

        int m = 45;
        System.out.println("m = " + m);
        double d =m;
        System.out.println("d = " + d);

        /*
        2)Explicitly Narrowing
        Java doesn't put a large data type into small data types.
         */
        int n = 15;
//        byte b1 = n;
        byte b1 = (byte) n;




    }


}
