package selfstudy;

public class Scratch01 {
    public static void main(String[] args) {
        int mask=0X222;
        System.out.println("mask = " + mask);
        System.out.println("mask = " + Integer.toBinaryString(mask));
        int value=0x2222;
        System.out.println("value = " + value);
        System.out.println("value = " + Integer.toBinaryString(value));
        System.out.println(value&mask);
    }
}
