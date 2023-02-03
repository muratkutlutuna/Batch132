package day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
        1)To create an "Array" we need to declare "the number of elements" at the beginning,
        we may need more elements to store or less elements to store inside the array.
        That is why declaring the number of elements at the beginning is not good.
        This is the negative side of arrays.

        To remove that negativity, Java created a new structure whose name is "ArrayList"(List is also used),
        when we use "ArrayList", no need to declare the number of elements you want to store in it.

        As a result; "Array" is fixed in length , "ArrayList" is flexible

        2) "ArrayList" can store just "non-primitive" data, "Array" can store "primitive" data and "reference"

        3) "Array"s work so fast
        "Arrays:s use memory so less
        If you are sure the number of elements will not change (For example month names), using "Array" is better
         */

        //How to create an ArrayList
        //1.Way:
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//[]

        //2.Way:
        List<Integer> prices = new ArrayList<>();
        System.out.println(prices);

        //How to add elements into an ArrayList
        //Note: add() method puts the element to the end
        //      add() method puts the elements in "insertion order"
        ages.add(13);
        ages.add(9);
        ages.add(21);
        System.out.println(ages);// [13,9,21]

        //add(1, 44); puts 44 to index 1
        ages.add(1, 44);
        System.out.println(ages);//[13, 44, 9, 21]

        prices.add(330);
        prices.add(550);
        prices.add(770);
        System.out.println(prices);

        //ages.addAll(prices); adds "prices" list elements into "ages" list
        ages.addAll(prices);
        System.out.println("ages = " + ages);//ages = [13, 44, 9, 21, 330, 550, 770]

        //ages.addAll(2, prices); adds "prices" list elements into "ages" list at index 2
        ages.addAll(2, prices);
        System.out.println("ages = " + ages);//ages = [13, 44, 330, 550, 770, 9, 21, 330, 550, 770]

        //How to remove all elements from a list
        prices.clear();
        System.out.println("prices = " + prices);

        //How to check if a specific element exists in a list
        boolean r1 = ages.contains(44);
        System.out.println("r1 = " + r1);


        //ages.containsAll(prices); if all prices list elements exists in ages list, Java returns true otherwise returns false
        boolean r2 = ages.containsAll(prices);
        System.out.println("r2 = " + r2);

        //How to check if two lists are same or not
        List<String>names1 = new ArrayList<String>();
        names1.add("Tom");
        names1.add("Angie");
        names1.add("Mark");

        List<String>names2 = new ArrayList<String>();
        names2.add("Tom");
        names2.add("Angie");
        names2.add("Mark");

        boolean r3 = names1.equals(names2);
        System.out.println(r3);//true

        //Example 1: Type code to check if two lists have same elements.
        //           Same elements can be in different indexes.
        //           [A,B,C] and [A,B,C] and [B,A,C] etc. ==> true
        List<Character>m=new ArrayList<>();
        m.add('A');
        m.add('B');
        m.add('C');

        List<Character>n=new ArrayList<>();
        n.add('A');
        n.add('B');
        n.add('C');

        Collections.sort(m);
        Collections.sort(n);

        boolean r4 = m.equals(n);
        System.out.println(r4);

    }
}
