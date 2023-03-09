package mentoring;

import java.util.Arrays;

class Hayvan{

    public Hayvan(){

    }


}

public class groupstudy01 {
    //Built-in

    public static void main(String[] args) {

        //Array
        //List

//        int a = 9;
//        String str = "abc";
//        Hayvan kus = new Hayvan();
//
//        //ArrayList
//        int arr1[] = new int[3];//[0, 0, 0]
//                                // 0  1  2 index, javaya gore elemanlarin sirasidir
//        System.out.println(arr1);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(arr1[0]);
//        int[] arr2 = new int[2];




        //arr3'un tum elemanlarini topla
        int[] arr3 = {1, 2, 3, 0};

        int sum = 0;

        for (int each : arr3) {
            sum=sum+each;
        }

        for (int i = 0; i < arr3.length; i++) {
            sum = sum + arr3[i];
        }











//        for (int i = arr3.length - 1; i >= 0; i--) {
//            System.out.println(arr3[i]);
//        }
//
























//        System.out.println("Arrays.equals(arr1, arr3) = " + Arrays.equals(arr1, arr3));
//        System.out.println();
//        System.out.println();
//
//        int arr4[] = new int[4];
//        System.out.println(arr4);
//        System.out.println(Arrays.toString(arr4));
//        int arr5[] = new int[4];
//        System.out.println(arr5);
//        System.out.println(Arrays.toString(arr5));
//        System.out.println("Arrays.equals(arr4, arr5) = " + Arrays.equals(arr4, arr5));
//        System.out.println("arr4==arr5 = " + (arr4 == arr5));


    }

}
