package selfstudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankJavaEndOfFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String>list = new ArrayList<String>();
        while(s.hasNextLine()){
            list.add(s.nextLine());
        }
        int count = 1;
        for (String line : list) {
            System.out.println(count+" " +line);
            count++;
        }
    }
}
