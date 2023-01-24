package selfstudy;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class S02 {
    public static void main(String[] args) {
        double p = 13543543.35435;
        Locale Ind = new Locale("en","IN");
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(Ind);
        String india = nfIndia.getCurrency().getCurrencyCode()+"."+nfIndia.format(p).substring(1);
        System.out.println(nfIndia.getCurrency());
        System.out.println(nfIndia.getCurrency().getCurrencyCode());
        System.out.println(nfIndia.getCurrency().getDisplayName());
        System.out.println(nfIndia.getCurrency().getSymbol());
        System.out.println(nfIndia.getCurrency().toString());
        System.out.println(nfIndia.getCurrency().getNumericCode());

    }
}
