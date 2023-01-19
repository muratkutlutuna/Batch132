package day12arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example 1: Create a String array with 5 elements, delete the elements whose length is less than 5
        //           [Orange, Blue, Red, Yellow, Brown] ==> [Orange, Yellow, Brown]
        String colors[] = new String[5];
        colors[0] = "Orange";
        colors[1] = "Blue";
        colors[2] = "Red";
        colors[3] = "Yellow";
        colors[4] = "Brown";

        //How many elements have greater than or eqyual to 5 characters
        int counter = 0;
        for (String w : colors) {
            if (w.length() >= 5) {
                counter++;
            }
        }

        System.out.println(counter);

        //Create new array to store the elements whose lengths are greater than or equal to 5
        String newArray[] = new String[counter];

        //Transfer the element whose lenths are greater than or equal to 5 to the newArray
        int idx = 0;

        for (String w : colors) {
            if (w.length() >= 5) {
                newArray[idx] = w;
                idx++;
            }
        }


    }
}
