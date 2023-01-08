package b132practices.practice02;

public class Q05 {
    public static void main(String[] args) {
        //1.Task: Count the alphabetical characters in a given value.

        String str = "Now!...Ali is 13 years old and he is a university student!!!";
        int totalNumOfChars = str.length();
        System.out.println(totalNumOfChars);//60

        String strWithoutPunct = str.replaceAll("\\p{Punct}", "");
        System.out.println("strWithoutPunct = " + strWithoutPunct);
        String strWithoutDigitsAndPunct = str.replaceAll("[^A-Za-z]", "");

        System.out.println(strWithoutDigitsAndPunct.length());//41
        System.out.println(totalNumOfChars - strWithoutDigitsAndPunct.length());//19
    }
}
