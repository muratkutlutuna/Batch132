package b132practices.practice04nt;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {

        //Type code to check if a specific element in an Array or not

//        String[] str = new String[6];

        String[] str = {"Ellie", "Susan", "Tom", "Brad", "Ali", "Veli"};

        String name = "Brad";

        int counter = 0;

        for (String w : str) {
            if (w.equals(name)) {
                counter++;
            }
            if (counter > 0) {
                System.out.println(name + " exists in Array");
            } else {
                System.out.println(name + " does not exist in Array");
            }
        }

        //2.Way:
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        int idx = Arrays.binarySearch(str, name);

        System.out.println(idx);

        int idxSally = Arrays.binarySearch(str, "Sally");
        System.out.println(idxSally);


    }
}
