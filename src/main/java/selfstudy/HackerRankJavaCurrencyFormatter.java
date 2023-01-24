package selfstudy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class HackerRankJavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double p = s.nextDouble();
        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfUS.format(p);
        Locale ind = new Locale("en","in");
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(ind);
        String india = nfIndia.format(p);
        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfChina.format(p);
        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nfFrance.format(p);
        System.out.printf("US: %s%n", us);
        System.out.printf("India: %s%n", india);
        System.out.printf("China: %s%n", china);
        System.out.printf("France: %s",france);
    }
}
