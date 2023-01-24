package selfstudy;

import java.util.Scanner;

public class HackerRankJavaDatatypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        boolean[][] r = new boolean[q][4];
        String[] nums = new String[q];
        while (q != 0) {
            String a = in.next();
            boolean abb=true, asb=true, aib=true, alb=true;
            try {
                Byte.parseByte(a);
            } catch (NumberFormatException e) {
                abb = false;
            }
            try {
                Short.parseShort(a);
            } catch (NumberFormatException e) {
                asb = false;
            }
            try {
                Integer.parseInt(a);
            } catch (NumberFormatException e) {
                aib = false;
            }
            try {
                Long.parseLong(a);
            } catch (NumberFormatException e) {
                alb = false;
            }
            r[q-1][0] = abb;
            r[q-1][1] = asb;
            r[q-1][2] = aib;
            r[q-1][3] = alb;
            nums[q-1] = a;

            q--;
        }

        for (int i = r.length - 1; i >= 0; i--) {
            if (r[i][0] || r[i][1] || r[i][2] || r[i][3]) {
                System.out.println(nums[i]+" can be fitted in:");
                if (r[i][0]){
                    System.out.println("* byte\n* short\n* int\n* long");
                } else if (r[i][1]) {
                    System.out.println("* short\n* int\n* long");
                } else if (r[i][2]) {
                    System.out.println("* int\n* long");
                } else if (r[i][3]) {
                    System.out.println("* long");
                }

            } else {
                System.out.println(nums[i] + " can't be fitted anywhere.");
            }

        }

    }
}
