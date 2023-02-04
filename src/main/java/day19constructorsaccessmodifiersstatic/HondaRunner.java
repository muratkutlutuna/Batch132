package day19constructorsaccessmodifiersstatic;

public class HondaRunner {
    public static void main(String[] args) {

        Honda h1 = new Honda();
        System.out.println(h1.numOfCarsProduced);//1
        System.out.println(h1.price);//20200

        Honda h2 = new Honda();
        System.out.println(h2.numOfCarsProduced);//2
        System.out.println(h2.price);//20200
    }
}
