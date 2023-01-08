package b132practices.practice01;

public class Q05 {

    //Write a Java program to break an integer into a sequence of individual digits .
    //Hint: use / and %
    //x: input: 12345
    //   output: 1
    //   output: 2
    //   output: 3
    //   output: 4
    //   output: 5
    public static void main(String[] args) {
        int num = 12345;
        int ones = num%10;
        System.out.println("ones = " + ones);
        int tens = (num/10)%10;
        System.out.println("tens = " + tens);
        int hundreds = (num/100)%10;
        System.out.println("hundreds = " + hundreds);
        int thousends = (num/1000)%10;
        System.out.println("thousends = " + thousends);
        int tenThousends = (num/10000);
        System.out.println("tenThousends = " + tenThousends);

        System.out.println(tenThousends+"\n"+thousends+"\n"+hundreds+"\n"+tens+"\n"+ones);

//        System.out.println(num%10);
//        num = num/10;
//        System.out.println(num%10);
//        num = num/10;
//        System.out.println(num%10);
//        num = num/10;
//        System.out.println(num%10);
//        num = num/10;
//        System.out.println(num%10);
    }
}
