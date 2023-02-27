package day31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lamda01 {
    /*
        1)We learned "Structured Programming" so far, in "Structured Programming" structure is very important, we spend time on structure
        2)Lambda is "Functional programming", in "Functional programming" we will focus on just functions(methods)
        3)"t -> code" is called "Lambda Expression".
          In "Functional programming" we may use "Lambda Expression"s but it is not recommended.
          We will prefer to use "Method Reference", we will learn it in the next sessions
     */
    public static void main(String[] args) {

        List<Integer>nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        long t1 = System.nanoTime();
        printElements1(nums);
        System.out.println();
        long t2 = System.nanoTime();
        printElements2(nums);
        System.out.println();
        long t3 = System.nanoTime();
        System.out.println();
        System.out.println("Structured = " + (t2 - t1));
        System.out.println("Functional = " + (t3 - t2));

        long t11 = System.nanoTime();
        printEvenElements1(nums);
        System.out.println();
        long t12 = System.nanoTime();
        printEvenElements2(nums);
        System.out.println();
        long t13 = System.nanoTime();
        System.out.println();
        System.out.println("Structured = " + (t12 - t11));
        System.out.println("Functional = " + (t13 - t12));

        long t21 = System.nanoTime();
        printSquareOfOddElements1(nums);
        System.out.println();
        long t22 = System.nanoTime();
        printSquareOfOddElements2(nums);
        System.out.println();
        long t23 = System.nanoTime();
        System.out.println();
        System.out.println("Structured = " + (t22 - t21));
        System.out.println("Functional = " + (t23 - t22));
        System.out.println();
        printCubeOfUniqueOddElements(nums);
        System.out.println();
        System.out.println(findSumOfSquareOfEvenElements(nums));
        System.out.println();
        System.out.println(calculateMultiplicationOfSquareOfDistinctEvenElements(nums));
        System.out.println();
        System.out.println(findMax1(nums));
        System.out.println();
        System.out.println(findMax2(nums));
        System.out.println();
        System.out.println(findMax3(nums));
        System.out.println();
        System.out.println(findMax4(nums));
        System.out.println();
        System.out.println(findMin1(nums));
        System.out.println();
        System.out.println(findMin2(nums));
        System.out.println();
        System.out.println(findMin3(nums));
        System.out.println();
        System.out.println(findMinGreaterThanSevenEven(nums));
        System.out.println();
        System.out.println(findAnyValueLessThanFifteenEven(nums));
    }

    //1)Create a method to print all list elements on the console in the same line with a space among them

    //1.Way: Used "Structured Programming"
    public static void printElements1(List<Integer> myList){
        for (Integer i : myList) {
            System.out.print(i + " ");
        }
    }

    //2.Way: Used "Functional programming"
    public static void printElements2(List<Integer> myList){//12 9 131 14 9 10 4 12 15
        myList.stream().forEach(t-> System.out.print(t+" "));
    }

    //2)Create a method to priont the "even" list elements on the console
    //  in the same line with a space between two consecutive elements.(Structured)

    //1.Way: Used "Structured Programming"
    public static void printEvenElements1(List<Integer> myList){
        for (Integer i : myList) {
            if (i%2==0) {
                System.out.print(i + " ");
            }
        }
    }

    //2.Way: Used "Functional programming"
    public static void printEvenElements2(List<Integer> myList){//12 9 131 14 9 10 4 12 15
        myList.
                stream().
                filter(t->t%2==0).
                forEach(t->System.out.print(t+" "));
    }

    //3)Create a method to print the square of odd list elements on the console
    //  in the same line with a space between two consecutive elements
    //1.Way: Used "Structured Programming"
    public static void printSquareOfOddElements1(List<Integer> myList){
        for (Integer i : myList) {
            if (i%2==1) {
                System.out.print((i*i) + " ");
            }
        }
    }

    //2.Way: Used "Functional programming"
    public static void printSquareOfOddElements2(List<Integer> myList){//12 9 131 14 9 10 4 12 15
        myList.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t->System.out.print(t+" "));
    }

    //4)Create a method to print the "cube" of "distinct" "odd" list elements
    //  on the console in the same line with a space between two consecutive elements.
    public static void printCubeOfUniqueOddElements(List<Integer> myList){//12 9 131 14 9 10 4 12 15
        myList.
                stream().
                filter(t->t%2!=0).
                distinct().
                map(t->t*t*t).
                forEach(t->System.out.print(t+" "));
    }

    //5)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public static int findSumOfSquareOfEvenElements(List<Integer> myList){

        return myList.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(0,(t,u)->t+u);

    }

    //6)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    public static int calculateMultiplicationOfSquareOfDistinctEvenElements(List<Integer> myList) {

        return myList.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t*t).
                reduce(1,(t,u)->t*u);
    }

    //7)Create a method to find the "maximum value" from the list elements
    //1.Way:
    public static int findMax1(List<Integer>myList){
        return myList.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t>u?t:u);
    }
    //2.Way:
    public static int findMax2(List<Integer>myList){
        return myList.
                stream().
                distinct().
                reduce(myList.get(0), (t, u) -> t>u?t:u);
    }
    //3.Way:
    public static int findMax3(List<Integer>myList){
        return myList.
                stream().
                distinct().
                sorted().
                reduce((t,u)->u).
                get();//reduce() method with a single parameter does not return integer
                                                           //To make return type integer use get() method
    }
    //4.Way:
    public static int findMax4(List<Integer>myList){
        return myList.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                findFirst().
                get();
    }

    //8)Create a method to find the "minimum value" from the list elements
    //1.Way:
    public static int findMin1(List<Integer>myList){
        return myList.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE, (t, u) -> t<u?t:u);
    }
    //2.Way:
    public static int findMin2(List<Integer>myList){
        return myList.
                stream().
                distinct().
                reduce(myList.get(0), (t, u) -> t<u?t:u);
    }
    //3.Way:
    public static int findMin3(List<Integer>myList){
        return myList.
                stream().
                distinct().
                sorted().
                findFirst().
                get();
    }

    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    public static int findMinGreaterThanSevenEven(List<Integer>myList){
        return myList.stream().distinct().filter(t->t>7&&t%2==0).sorted().findFirst().get();
    }

    //10)Create a method to find any value which is less than 15 and even from the list
    public static int findAnyValueLessThanFifteenEven(List<Integer>myList){
        return myList.stream().distinct().filter(t->t<15&&t%2==0).findAny().get();
    }

}


