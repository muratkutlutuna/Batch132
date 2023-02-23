package b132practices.practise05nt;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {
        /*
             From a given list find all pairs whose sum is a given number
             {4, 6, 5, -10, 8, 5, 20}==>10
             For ex: 4+6=10, 5+5=10, -10+20=10
         */

        int[] list = {4, 6, 5, -10, 8, 5, 20};
        System.out.println(Arrays.toString(list));
        int k = 10;
        for (int i = 0; i < list.length; i++){
            for (int j = i+1; j <list.length; j++) {
                if ((list[i] + list[j]) == k) {
                    System.out.println(list[i]+" + " + list[j] + " = " +(list[i] + list[j]));
                }

            }
        }
    }
}
