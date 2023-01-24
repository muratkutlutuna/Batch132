package selfstudy;

import java.util.Scanner;

public class HackerRankJavaIntToString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Short n = s.nextShort();
        if (n.toString().getClass().getName().equals("java.lang.String")) {
            System.out.println("Good job");
        }
    }
}
