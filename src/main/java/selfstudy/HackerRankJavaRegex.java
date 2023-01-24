package selfstudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankJavaRegex {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        while(s.hasNext()) {
            list.add(s.nextLine());
        }

        new myRegex(list);

    }
}
class myRegex{
    private Pattern pattern;
    myRegex(String str){
        String zeroTo255 = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";
        String regex = zeroTo255 + "\\."+ zeroTo255 + "\\."+ zeroTo255 + "\\."+ zeroTo255;
        this.pattern = Pattern.compile(regex);
        if (this.pattern == null) {
            System.out.println(false);
        }else {
            Matcher m = this.pattern.matcher(str);
            System.out.println(m.matches());
        }
        System.out.println(this.pattern.toString());
    }
    myRegex(List<String>str){
        String zeroTo255 = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";
        String regex = zeroTo255 + "\\."+ zeroTo255 + "\\."+ zeroTo255 + "\\."+ zeroTo255;
        this.pattern = Pattern.compile(regex);
        if (this.pattern == null) {
            System.out.println(false);
        }else {
            for (String w : str) {
                Matcher m = this.pattern.matcher(w);
                System.out.println(m.matches());
            }
        }
    }
}
