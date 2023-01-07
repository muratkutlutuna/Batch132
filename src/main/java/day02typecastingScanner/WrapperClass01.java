package day02typecastingScanner;

/**
 * The type Wrapper class 01.
 */
public class WrapperClass01 {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        /*
        Wrapper Class
        Non-Primitive data types have "methods" together with the values.
        We can do many actions by using "methods" which is very useful.
        But primitives do not have anu "methods" because of that we can not do any actions/use methods with
        primitive data types.
        Java created wrapper classes to handle this. Java created a new structure which has primitive value and
        "methods" together. This is called "Wrapper Classes".

        Wrapper Classes are Non-Primitive data types.
        Primitive Data      Wrapper Class
        byte                Byte
        short               Short
        int                 Integer
        long                Long
        float               Float
        double              Double
        boolean             Boolean
        char                Character


         */
        int age = 13; //There is no method

        Integer number = 19; // There are many useful methods

        float numberff = number;

        float numberf = number.floatValue();
        System.out.println("numberf = " + numberf);

        char c = 'A';

        //Autoboxing: To convert primitive data to wrapper class of the primitive data.

        byte b =23;
        Byte wb = b;
        System.out.println("wb = " + wb);

        //Unboxing: To convert "wrapper class object" into its primitive

        short ws = 188;
        Short s = ws;
        System.out.println("s = " + s);



    }

}
