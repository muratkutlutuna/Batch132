package selfstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankTagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        while (count > 0) {
            boolean matched = false;
            String line = in.nextLine();
            String regex = "<(.+)>([^<>]+)<(/\\1)>";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);

            while(m.find()){
                System.out.println(m.group(2));
                matched = true;
            }
            if (!matched) {
                System.out.println("None");
            }
            count--;
        }
        in.close();
    }
}
