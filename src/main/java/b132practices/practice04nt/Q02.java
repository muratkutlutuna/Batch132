package b132practices.practice04nt;

public class Q02 {
    public static void main(String[] args) {
        //Type code to print the integers divisible by 4 and 6 from 13 to 211.
        for (int i = 13; i < 212; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("================================");
        //2.Way: by using while-loop

        int i = 13;

        while (i < 212) {
            if(i%4==0 && i%6==0) {
                System.out.print(i+" ");
            }
            i++;
        }


    }
}
