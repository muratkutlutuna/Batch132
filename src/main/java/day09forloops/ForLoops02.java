package day09forloops;

public class ForLoops02 {
    public static void main(String[] args) {
        //Example 1: Put * between 2 consecutive characters and to the end in a String.
        //           For example; "Java" ==> J*a*v*a*

        String s = "Java";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + "*");
        }
        System.out.println();
        //Example 2: Type code to print unique characters in a String.
        //           Hello ==> Heo
        String s2 = "sadsdgsdbebvdfbdfb";

        for (int i = 0; i < s2.length(); i++) {
            if (s2.indexOf(s2.charAt(i)) == s2.lastIndexOf(s2.charAt(i))) {
                System.out.print(s2.charAt(i));
            }
        }
        System.out.println();

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (s2.indexOf(ch) == s2.lastIndexOf(ch)) {
                System.out.print(ch);
            }
        }
        System.out.println();
        //Example 3: Type code to print a String in reverse after removing spaces.
        //           For example; "Ali Can" ==> "naCilA"

        String s3 = "Ali Can";

        for (int i = s3.length() - 1; i >= 0; i--){
            if(s3.charAt(i)!=' ')
                System.out.print(s3.charAt(i));
        }

        //Example 4: Type code to find the sum of the integers from 3 to 7
        //           For example; 3 ==> 3

        int sum = 0;

        for (int i = 3; i <= 7; i++) {
            sum += i;
        }

        System.out.println(sum);



    }
}
