package day04stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: Get the four characters from a String and convert them to lower cases
        //           Albania ==> Alba ==> alba

        String s = "Albania";

        s.substring(0,4).toLowerCase();

        System.out.println("s = " + s);

        //Example 2: Chech if two Strings are same or not?
        String r = "Java";
        String u = "java";

        boolean sameEqualSign = r==u;
        System.out.println("sameEqualSign = " + sameEqualSign);//false because values and addresses are different

        boolean same = r.equals(u);
        System.out.println("same = " + same);//false because values are different

        boolean sameIgnoreCase = r.equalsIgnoreCase(u);
        System.out.println("sameIgnoreCase = " + sameIgnoreCase);//true

        //Question: Why don't we use "==" to compare Strings?
        //1.Scenario: "==" and "equals()" gives you the same output
        String k = "Java";
        String m = "java";

        boolean f1 = k==m;
        System.out.println("f1 = " + f1);

        boolean f2 = k.equals(m);
        System.out.println("f2 = " + f2);

        //2.Scenario: "==" and "equals()" gives you the same output

        String s1 = "TechPro";
        String s2 = "TechPro";

        boolean r1 = s1==s2;
        System.out.println("r1 = " + r1);

        boolean r2 = s1.equals(s2);
        System.out.println("r2 = " + r2);

        //3.Scenario: "==" and "equals()" gives you different output

        String t1 = "Python";
        String t2 = new String("Python");

        boolean d1 = t1==t2;
        System.out.println("d1 = " + d1);

        boolean d2 = t1.equals(t2);
        System.out.println("d2 = " + d2);
    }

}
