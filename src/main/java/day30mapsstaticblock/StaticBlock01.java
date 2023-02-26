package day30mapsstaticblock;

import java.time.LocalDate;

public class StaticBlock01 {
    /*
        1)Other name of the "static variable" is "class variable"
          Because "Java Class Loader" loads the static variables together with the class.
          So static variables are created when the class was created
        2)Non-static variables I mean Instance or Object variables are created when you create an Object
        3)To initialize "static variable" we have two options
            i)Initialize directly like "public static int price = 1000;"
            ii)Initialize by using Static Block"
            Why do we need "static block" to initialize a static variable?
            1)Sometimes to initialize a static variable, we need to type codes.
              To do that; use "static block"
            2)static blicks are executed before everything in the class even main method
        4)There is "instance block" as well
          Instance Block is used if you want to execute same code in all constructors in a class
     */


    public static int price;

    static{
        LocalDate d = LocalDate.now();

        if (d.getMonthValue() == 2) {
            price = 1000;
        } else {
            price = 2000;
        }
        System.out.println("I am static block");
    }

    public int year;
    public static void main(String[] args) {
        System.out.println("I am main");
    }

    {
        System.out.println("I am instance block");
    }

    public StaticBlock01(){
        System.out.println("I am first constructor");
    }

    public StaticBlock01(int year){
        this.year = year;
        System.out.println("I am second constructor");
    }

}
