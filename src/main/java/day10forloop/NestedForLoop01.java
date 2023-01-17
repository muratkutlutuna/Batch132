package day10forloop;

public class NestedForLoop01 {
    public static void main(String[] args) {

        /*
            2.Example:Type code to get the output like
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
 */
        /*
        Nested loops are "Time consuming", that is why if it is not mandatory, do not prefer to use "Nested Loops"
        If a code is "time-consuming" it means it has "time complexity"
        There is a way to calculate the value of "Time complexity": if you have 2 loops, time complexity is the square of 2 ==> 4
                                                                    if you have 2 loops, time complexity is the cube of 3 ==> 27
         */
        for (int i = 1; i < 5; i++) {
            System.out.println("Week; " + i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("\tday: " + j);
            }
        }

        /*
     Example 3: Write a Java Program to Print Rectangle Star Pattern using For Loop
                 ****
                 ****
                 ****
     Note: Get the number of rows and columns from user
 */
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
