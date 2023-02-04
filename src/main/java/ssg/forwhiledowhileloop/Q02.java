package ssg.forwhiledowhileloop;

import java.util.Scanner;

public class Q02 {
// ask the user to enter as many numbers as they want
    // if the sum of the numbers entered by the user exceeds 500
    // now you have entered enough numbers, the total is....
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter as many numbers as you want");
    int sum = 0;

    while (sum<=500) {
        sum += s.nextInt();
    }
    System.out.println("You have enterded enough numbers");
    System.out.println("sum of the numbers is = "+sum);





}

}
