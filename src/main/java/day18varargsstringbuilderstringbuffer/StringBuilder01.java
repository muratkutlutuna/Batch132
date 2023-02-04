package day18varargsstringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {
        /*
            1)"StringBuilder" is a Class in Java, it is used to create Strings.
            2)Question: We have a" String Class to create "Strings", why did Java create a "StringBuilder" class to create "Strings"?
                        "String Class" is "Immutable", we sometimes need "Mutable Strings" that is why Java created "SteingBuilder" class
                        Not: "Immutable" means can not be ubdated.
            3)StringBuilder is not |thread-safe" and is not "synchronized"
            "thread-safe" means being able to do "multiple threads(task)" at the same time
            "synchronized" means being able to select appropriate order for "multi thread"
            If you need a String to use in "multi thread" use "StringBuffer"
            "StringBuffer" is a Class in Java, and it is used to create Strings
            "StringBuffer" is "thread-safe| and it is "synchronized"

            "StringBuffer" was created before "StringBuilder", it was created in Java 5

            To create String we have 3 options
            i)String Class: If you need "immutable String" use String Class to create a String
            ii)StringBuilder Class: If you need "mutable String" and do not need "multi thread" and "synchronization" use
                                    StringBuilder Class to create a String.
            iii)StringBuffer Class: If you need "mutable String" and "multi thread" and "synchronization" use
                                    StringBuffer Class to create a String.

                                    Note: StringBuilder is faster than StringBuffer

         */

        String s = "Java";
        //Sting Class is "Immutable" that is why when you do any update on "s", Java does not change the value in "s container"
        //Java creates a new container foer the u[dated value and puts tje updated value in the new container.
        String t = s + "!";
        System.out.println(s);//Java

        //Let us create a "Mutable String"
        StringBuilder sb1 = new StringBuilder("Java");
        System.out.println(sb1);//Java

        //When I use any method to update a StrungBuilder original value will be updated.
        sb1.append("!").append("...");
        System.out.println(sb1);//Java!...

        //insert(4," is love") will skip 4 characters, themninsert " is love"
        sb1.insert(4, " is love");
        System.out.println(sb1);//Java is love!...

        sb1.insert(2, "Money", 1, 4);
        System.out.println(sb1); //Jaoneva is love!...

        sb1.replace(2, 5, "1");
        System.out.println(sb1); //Ja1va is love!...

        sb1.deleteCharAt(2);
        System.out.println(sb1);//Java is love!...

        sb1.delete(8, 12);
        System.out.println(sb1);//Java is !...

        //If "Reverse a String" question is asked to you in an interview , do not forget to mention about reverse() method
        //in StringBuilder class.
        sb1.reverse();
        System.out.println(sb1);//...! si avaJ

        //toString(); is for converting "StringBuilder" to "String", but toString(); method does not change the
        //structure of original "StringBuilder"
        String newS = sb1.toString();
        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Kava");

        //sb2.compareTo(sb3); method compares sb2 with sb3 lexicographically.
        //If sb2 is before sb3 the result will be negative, If sb2 is after sb3 the result will be positive
        //The int value method returns displays the difference between the ASCII values
        int r = sb2.compareTo(sb3);
        System.out.println("r = " + r);

    }
}
