package selfstudy;

import java.nio.channels.ByteChannel;
import java.util.Scanner;

public class HackerRankJavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
