package day13arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Example 1: Create an integer array and print elements less than 10 on the console.
        int ages[] = new int[7];
        ages[0] = 13;
        ages[1] = 6;
        ages[2] = 19;
        ages[3] = -8;
        ages[4] = 10;
        ages[5] = 2;
        ages[6] = 87;

        //1.Way:         // 13, 6, 19, -8, 10, 2, 87
        for (int w : ages) {
            if (w < 10) {
                System.out.println(w + " ");// 6 -8 2
            }
        }

        //2.Way:         // -8, 2, 6, 10, 13, 19, 87
        Arrays.sort(ages);

        for (int w : ages) {
            if (w >= 10) {
                break;
            }else{
                System.out.println(w + " ");
            }
        }
        System.out.println();

        //Example 2: Create an integer array and print elements greater than 10 on the console.
        int nums[] = new int[7];
        nums[0] = 13;
        nums[1] = 6;
        nums[2] = 19;
        nums[3] = -8;
        nums[4] = 10;
        nums[5] = 2;
        nums[6] = 87;

        //1.Way:
        for (int w : nums) {
            System.out.println(w + " ");
        }

        //2.Way:
        Arrays.sort(nums);

        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i]<=10) {
                break;
            }else{
                System.out.println(nums[i] + " ");
            }
        }

        //3.Way:
        for (int w : nums) {
            if (w <= 10) {
                continue;// If  you want to skip elements in a loop use "continue" keyword.
            }else{
                System.out.println(w + " ");
            }
        }

    }
}
