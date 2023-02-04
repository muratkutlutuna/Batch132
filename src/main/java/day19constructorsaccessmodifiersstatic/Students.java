package day19constructorsaccessmodifiersstatic;

public class Students {

    /*
        1)We need "constructor" to create an object from a clas.
        2)When we create a class Java puts a constructor in it, because Java knows classes arte for creating onbjects.
        3)When we create a class you will not see any constructor in it, but the class has constructor, it is invisible constructor.
        4)Invinsible constructors are called "Default Constructor"
        5)To create a constructor follow the steps;
             i)Use access modifier mostly we ise "public" access modifier
             ii)Use class name as constructor name
             iii)Open close constructor parantheiss
             iv)Open close curly braces
        6)When you create constructor manually Java will delete the "default constructor"
        7)We can create many constructors in a class
             i)Constructors names will be same because every constructor uses class name as name
             ii)Every constructor must have different parameters
        8)Question: What are the differences between constructor and method?
             i)Methods have "return type" but constructors do not have
             ii)Methods are for some actions , Constructors are for object creation
     */
    public String stdName;
    public int age;
    public boolean success;
    public String gender;

    //Default constructor is the same with the following constructor
    public Students(){

    }

    //Create a constructor uses all variables
    public Students(String stdName, int age, boolean success, String gender) {
        this.stdName = stdName;
        this.age = age;
        this.success = success;
        this.gender = gender;
    }

    //Create a constructor uses some od the variables
    public Students (String stdName, int age, boolean success) {
        this.stdName = stdName;
        this.age = age;
        this.success = success;
    }

    //Create a constructor by using intellij


    public Students(String stdName, int age) {
        this.stdName = stdName;
        this.age = age;
    }
}
