package day22overridingencapsulation;

public class StudentRunner {

    public static void main(String[] args) {

        Student myStd = new Student();

        String psychologicalIssues = myStd.getPsychologicalIssues();
        System.out.println("psychologicalIssues = " + psychologicalIssues);

    }



}
