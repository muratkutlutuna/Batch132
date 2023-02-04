package day16arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Example 1: Create a salary list and increase the salary %10 if the salary is less than 5000 dollars.
        //           [4500,6400,2300,5000, 7150] ==> 4500-->4950 - 2300-->2530
        //           [4950,6400,2530,5000,7150]
        List<Integer> salaries = new ArrayList<Integer>();
        salaries.add(4500);
        salaries.add(6400);
        salaries.add(2300);
        salaries.add(5000);
        salaries.add(7150);
        System.out.println("salaries = " + salaries);

        //1.Way:
        for (Integer w : salaries) {
            if (w < 5000) {
                int temp=  (w / 10)* 11;
                salaries.set(salaries.indexOf(w), temp);
            }
        }
        System.out.println("salaries = " + salaries);

        //2.Way:
        for (Integer w : salaries) {
            if (w>=5000) {
                continue;
            }else{
                int temp=  (w / 10)* 11;
                salaries.set(salaries.indexOf(w), temp);
            }
        }
        System.out.println("salaries = " + salaries);

    }
}
