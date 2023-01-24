package selfstudy;

import java.util.Scanner;

public class HackerRankJavaStaticInitializerBlock {
    static short B;
    static short H;
    static {
        B=101;
        H=101;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        B = s.nextShort();
        H = s.nextShort();
        if (B > 0 && H > 0) {
            System.out.println(B*H);
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
