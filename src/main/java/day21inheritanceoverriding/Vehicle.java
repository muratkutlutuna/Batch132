package day21inheritanceoverriding;

/*
    1)Every Class exceptObject Class has Parent Class in Java
    2)Object Class is the Parent Class of all Classes in Java
    3)Just Object Class does not have any Parent Class in Java
 */

public class Vehicle {

    public void move(){
        System.out.println("All vehicles move...");
    }

    public void price() {
        System.out.println("To buy a vehicle you should pay the price...");
    }

}
