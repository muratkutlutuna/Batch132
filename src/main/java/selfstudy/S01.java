package selfstudy;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int q = Integer.parseInt(s.nextLine().trim());
        String queriesArr[] = new String[q];
        while(q!=0){
            String str = s.nextLine().trim();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            int n = Integer.parseInt(str.split(" ")[2]);
            queriesArr[q-1] = returnings(a,b,n);
            q--;
        }
        for (int i = queriesArr.length-1; i>=0;i--) {
            System.out.println(queriesArr[i]);
        }
    }
    public static String returnings(int a, int b , int n){
        int arr[] = new int[n];

        arr[0] = a+b;

        for(int i = 0; i<n ; i++){
            arr[i] = a;
            for(int k = 0;k<=i;k++){
                arr[i]+=(int)Math.pow(2,(k))*b;
            }
        }
        String str = "";
        for(int w : arr){
            str+=""+w+" ";
        }
        return str.trim();
    }
}
