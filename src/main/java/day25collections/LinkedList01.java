package day25collections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
        1) Removing operation needs too much tasks for Java,
           that is why if we need too much removing operation
           we do not prefer to ArrayList
        2) Adding element/s into an ArrayList makes Java reindex,
           this is too many tasks for Java,
           that is why we do not prefer ArrayList in adding operation

        3) LinkedList does not use indexes, LinkedList works with "nodes"
           Nodes have two parts i)Data Part ii)Pointer Part
           Pointer points the next element
           Last node is called as "Tail" and LinkedList has head points the first node
        4) When you remove any element Java changes just the pointers,
           does not touch the other elements. This is not too many tasks
           that is why we prefer to use "LinkedList" in removing operations.
        5) When you add any element Java changes just the pointers,
           does not touch the other elements. This is not too many tasks
           that is why we prefer to use "LinkedList" in adding operations.

        6) ArrayList uses indexes, indexes are like adresses.
           When you have address, it is so easy to find the element.
           Because of that, ArrayLists are so successful in "search operations"
        7) LinkedList does not use indexes, it means "nodes" do not have addresses.
           When you do not have address, it will be so difficult to find the node.
           Because of that, LinkedLists are not successful in "search operations"
        8) If you create a functionality to add and remove museum visitors in an app, use "LinkedList"
           If you create a functionality to add zipcodes and find zipcodes for specific areas in an app, use "ArrayList"

           As a summary; LinkedList is successful in "adding" and "removing" operations but not successful in "search" operation
           ArrayList is successful in "search" operation but not successful in "adding" and "removing" operations
     */

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Ali");
        names.addLast("Brad");
        names.add(2, "Jim");
        names.addLast("Brad");
        names.addFirst("Angie");
        names.addLast("Brad");
        names.add("Ali");

        System.out.println(names);//[Angie, Ali, Brad, Jim, Brad, Brad, Ali]

        //Retrieves and removes the head of the queue represented by this deque
        String f1 = names.remove();
        System.out.println(f1);
        System.out.println(names);//[Ali, Brad, Jim, Brad, Brad, Ali]

        //Removes a single instance of the specified element from this collection.
        //if it is present (optional operation).
        boolean r1 = names.remove("Brad");
        System.out.println(r1);//true
        System.out.println(names);//[Ali, Jim, Brad, Brad, Ali]

        //Removes the element at the specified position in this list (optional operation).
        //Shifts any subsequent elements to the left (subtracts one from their indices).
        //Returns the element that was removed from the list.
        String r2 = names.remove(2);
        System.out.println(r2);//Brad
        System.out.println(names);//[Ali, Brad, Brad, Ali]

        //Retrieves and removes the last element of this deque.
        String r3 = names.removeLast();
        System.out.println(r3);//Ali
        System.out.println(names);//[Ali, Brad, Brad]

        //Removes the last occurrence of the specified element from this deque.
        //If the deque does not contain the element, it is unchanged.
        //Returns boolean
        boolean r4 = names.removeLastOccurrence("Brad");
        System.out.println(r4);//true
        System.out.println(names);//[Ali, Brad]

        /*
            When you learn a method focus on 3 things; i)What the method does?
                                                       ii)What the method returns?
                                                       iii)How the method behaves for specific scenarios?
         */

        LinkedList<String> students = new LinkedList<>();

        students.add("Ali");
        students.addLast("Brad");
        students.add(2, "Jim");
        students.addLast("Brad");
        students.addFirst("Angie");
        students.addLast("Brad");
        students.add("Ali");
        System.out.println("students = " + students);

        //Pops an element from the stack represented by this deque.
        //In other words, removes and returns the first element of this deque.
        //This method equivalent to removeFirst().
        //NoSuchElementException - if this deque is empty
        students.pop();
        System.out.println(students);//[Ali, Brad, Jim, Brad, Brad, Ali]

        //Retrieves and removes the head of the queue represented by this deque (in other words,
        //the first element of this deque), or returns null if this deque is empty.
        students.poll();//removes "Ali"

        //Retrieves, but does not remove, the head of the queue represented by this deque(Copy + Paste)
        //NoSuchElementException - if this deque is empty
        String r5 = students.element();
        System.out.println(r5);//Brad
        System.out.println(students);//[Brad, Jim, Brad, Brad, Ali]

        //Retrieves, but does not remove, the head of the queue represented by this deque
        //or returns null if this deque is empty.
        //This method is equivalent to peekFirst().
        String r6 = students.peek();
        System.out.println(r6);//Brad
        System.out.println(students);//[Brad, Jim, Brad, Brad, Ali]

        //Retrieves, but does not remove, the first element of this deque.
        //This method differs from peekFirst only in that it throws an exception if this deque is empty.
        //NoSuchElementException - if this deque is empty
        String r7 = students.getFirst();
        System.out.println(r7);//Brad
        System.out.println(students);//[Brad, Jim, Brad, Brad, Ali]

        //Returns the element at the specified position in this list.
        String r8 = students.get(1);
        System.out.println(r8);//Jim
        System.out.println(students);//[Brad, Jim, Brad, Brad, Ali]

        students.set(1, "John");
        System.out.println(students);//[Brad, John, Brad, Brad, Ali]

    }
}
