package b132practices.practice02;

public class Q03 {

    //
    public static void main(String[] args) {

        /*
        String shirtPrice = "$ 12.99";
        String bookPrice = "$ 35.99";
        Type code to find the sum of the shirt and book prices.
         */

        String shirtPrice = "$ 12.99";
        String bookPrice = "$ 35.99";
        String shirt = shirtPrice.replace("$ ", "");
        String book = bookPrice.replace("$ ", "");
        double sd = Double.valueOf(shirt);
        double bd = Double.valueOf(book);
        double sum = sd + bd;
        System.out.println("$ "+sum);


    }


}
