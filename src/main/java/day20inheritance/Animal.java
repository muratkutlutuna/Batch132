package day20inheritance;

public class Animal {
    /*
        i)Intheritance prevents following issues;
            1)Repetition
            2)Difficulty in updating codes
            3)Difficulty in fixing codes
            4)Prevents atomic structure
        ii)Child classes can use method or variables from parent Classes but parent classes cannot use
           methods or variables from child classes
        iii) *)For "public" and " protected " acces modifiers, there is no any issue in "inheritance"
             *)For "default" access modifier, if the object and the parent class are in the same package
               inheritance is possible , but if the object and the parent class are in different packages
               inheritance is impossible.
             *)For "private" access modifier inheritance is impossible
        iv)"HAS-A" means "from parent to child", "IS-A" means "from child to parent"
        v) Java does nr accept multiple parents for a class , "Java does not support multiple inheritance, Java supports single inheritance"
     */
    public void eat() {
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }
}
