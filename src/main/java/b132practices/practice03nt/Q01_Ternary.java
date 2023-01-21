package b132practices.practice03nt;

public class Q01_Ternary {

    public static void main(String[] args) {

        //Type code to check if a number is positive or not

        //1.Way:

        int x = 23;
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        //2.Way:

        String r = x > 0 ? "Positive" : "Negative";
        System.out.println(r);

        //Type code to check if an integer has 3 digits or not

        int y = -234;
        int absY = Math.abs(y);
        String r2 = absY>99 && absY<1000 ? "It has 3 digits" : "It has does not 3 digits";
        System.out.println(r2);


    }


}
