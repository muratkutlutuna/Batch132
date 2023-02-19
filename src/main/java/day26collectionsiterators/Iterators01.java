package day26collectionsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {

        /*
            1)Iterators do the same with the loops
            2)Loops have infinite loop risk but Iterators do not have
            3)There are not performance difference between loops and iterators
            4)Iterators are more successful in removing elements and updating elements in a collection

            5)There are two types of iterators i)Iterator: It can just remove the elements, it is impossible to uodate and add
                                                           It works just from left to the right
                                               ii)ListIterator: It can remove and update the elements
                                                                It works just from left to the right and right to the left
         */

        //Let use Iterator
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

        Iterator<String> myItr =myList.iterator();
        while (myItr.hasNext()) {
            myItr.next();
            myItr.remove();
        }

        System.out.println(myList);//[]

        //Let use ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);//[Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()) {
            String el = yourListItr.next();
            yourListItr.set(el+"!...");
        }

        System.out.println(yourList);//[Tom!..., Jim!..., Clara!..., Angie!..., Mark!...]

        //Example: Print the yourList elements on the console
        //         from the last element to the first element in the same line with a space
        //         between two consecutive elements

        List<String> yourList1 = new ArrayList<>();
        yourList1.add("Tom");
        yourList1.add("Jim");
        yourList1.add("Clara");
        yourList1.add("Angie");
        yourList1.add("Mark");
        System.out.println(yourList1);
        ListIterator<String> yrListItr = yourList1.listIterator();

        //Following loop will move the pointer to the very end
        while (yrListItr.hasNext()) {
            yrListItr.next();
        }

        //Following loop will work from the last element to the first element
        while (yrListItr.hasPrevious()) {
            System.out.print(yrListItr.previous()+" ");
        }


    }
}
