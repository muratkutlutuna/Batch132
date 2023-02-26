package day30mapsstaticblock;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        String s = "Java is easy, Java is OOP, OOP makes Java easy.";

        System.out.println(numOfLetters(s));

        System.out.println(getNumOfLetterOccurrence(s));

    }

    //Example 1: Create a method to display the number of occurrences of the letters in a sentence
    //           Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, a=1, e=1

    public static String numOfLetters(String sentence){
        int[]howManyChars= new int[126];
        for (int i = 0; i < sentence.length(); i++) {
            howManyChars[sentence.charAt(i)]++;
        }
        String numOfLetters = "";
        for (int i = 0; i<howManyChars.length; i++) {
            if (!(i>64&&i<91||i>96&&i<123)) {
                continue;
            }
            if (howManyChars[i] > 0) {
                numOfLetters+=(char)i+"="+howManyChars[i]+", ";
            }
        }

        return numOfLetters.substring(0, numOfLetters.length()-2);
    }

    public static HashMap<String, Integer> getNumOfLetterOccurrence(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");

        HashMap<String, Integer>letterOcc=new HashMap<String, Integer>();

        String[] letters = s.split("");

        for (String w : letters) {

            Integer numOfOcc = letterOcc.get(w);

            if (numOfOcc == null) {
                letterOcc.put(w, 1);
            }else{
                letterOcc.put(w, numOfOcc + 1);
            }

        }

        return letterOcc;

    }

}
