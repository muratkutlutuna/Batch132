package day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

    /*
    When you talk about "Arrays" use "Array's length"
    When you talk about "Lists" use "List's size"
     */

    public static void main(String[] args) {

        //Example 2: Type code to print the elements of a kist if the elemenets is greater than the number of eloemeents in the kist
        //           [5,9,3,4,6] ==> 9-6
        List<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(13);
        nums.add(4);
        nums.add(6);

        //1.Step: Find the number of list elements
        int numOfEl = nums.size();

        //2.Step: Check if an elements is greater than the number of list elements then print it
        for (Integer w : nums) {
            if (w>numOfEl) {
                System.out.println(w + " ");
            }
        }


    }
}
