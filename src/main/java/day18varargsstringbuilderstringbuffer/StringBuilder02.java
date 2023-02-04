package day18varargsstringbuilderstringbuffer;

public class StringBuilder02 {
    public static void main(String[] args) {

        //Another way to create a StringBuilder
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java");

        //length(); method gives the number of characters used in the String
        int length = sb1.length();
        System.out.println("length = " + length);//4

        int capacity = sb1.capacity();
        System.out.println("capacity = " + capacity);//16

        sb1.append("xxxxxxxxxxxxx");
        length = sb1.length();
        System.out.println("length = " + length);
        capacity = sb1.capacity();
        System.out.println("capacity = " + capacity);//34

        sb1.append("mmmmmmmmmmmmmmmmmm");
        length = sb1.length();
        System.out.println("length = " + length);
        capacity = sb1.capacity();
        System.out.println("capacity = " + capacity);//70       34 <== 16 * 2 + 2      70 <== 34 * 2 + 2

        //Another way to create a StringBuilder
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println("sb2.length() = " + sb2.length());//0
        System.out.println("sb2.capacity() = " + sb2.capacity());//2

        sb2.append("FL");
        System.out.println("sb2.length() = " + sb2.length());//2
        System.out.println("sb2.capacity() = " + sb2.capacity());//2

        sb2.append("!");
        System.out.println("sb2.length() = " + sb2.length());//3
        System.out.println("sb2.capacity() = " + sb2.capacity());//6 <== 2 * 2 + 2

        //Create a String by using StringBuffer Class
        StringBuffer sbf = new StringBuffer();
        sbf.append("Wooow!");
        System.out.println("sbf.length() = " + sbf.length());//6
        System.out.println("sbf.capacity() = " + sbf.capacity());//16


    }
}
