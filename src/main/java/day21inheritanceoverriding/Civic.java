package day21inheritanceoverriding;

public class Civic extends Honda{

    public void ecoSystem(){
        System.out.println("Using Civic is not expensive...");
    }

    public Civic() {
        super(2022);
        System.out.println("Civic constructor...");
    }

    public Civic(boolean Hybrid) {
        this();
        System.out.println("Civic constructor with boolean parameter");
    }
}
