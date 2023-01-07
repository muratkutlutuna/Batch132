package day01datatypesvariables;

/**
 * The type Data types 01.
 */
public class DataTypes01 {

    // public: It means it can be used from etire the project.
    //         There is no any restriction to use it.
    //         "public" is one of the "access modifier"s

    //we have 4 access modifiers: i)public ii)protected iii)default iV)private

    //default: it means it is open to a group. )Harward University Library)
    //         If you make something "default" in Java, it will be used just inside the package.
    //         To make something "default" in Java, do not type any access modifier.

    //protected: It means it is open to a group anf their kids. (Gym is open to employees and their kids)

    //private: It means it is specific for a person. (Driving License)
    //         If you make something "private" you can use it just while you are in the class.
    //         When you go outside class it is impossible to use it.

    //When you create something in java, you should name it.
    //How to name a class: i)Start with upper cases
    //                     ii)If you have multiple words, every word should start with upper cases
    //                     iii)Other characters should be in lower cases
    //                     iV) You can use digits in naming

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
//The part between the "{" and "}" is called "Class Body"
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}