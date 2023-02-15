package day22overridingencapsulation;

public class Cat extends Mammal{

    @Override //Override Anotation ==> Checks the overriding rules
    public void eat() {//Overriding Method
        System.out.println("Cats eat...");
    }

    @Override
    public Animal create() {
        return new Cat();
    }

//    @Override
//    public Animal occur() {
//        return new Cat();
//    }
    //it gives CTE because Animal does not that functionality


    @Override
    public Integer number() {
        return 456;
    }
}
