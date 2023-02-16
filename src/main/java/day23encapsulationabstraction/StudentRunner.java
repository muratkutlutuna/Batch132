package day23encapsulationabstraction;


public class StudentRunner {

    public static void main(String[] args) {

        Student myStd = new Student();

        String psychologicalIssues = myStd.getPsychologicalIssues();
        System.out.println("psychologicalIssues = " + psychologicalIssues); //Depression

        myStd.setPsychologicalIssues("Bipolar");

        String psycho2 = myStd.getPsychologicalIssues();
        System.out.println("psycho2 = " + psycho2);//Bipolar

        boolean success1 = myStd.isSuccess();
        System.out.println("success1 = " + success1);//true

        myStd.setSuccess(false);

        boolean success2 = myStd.isSuccess();
        System.out.println("success2 = " + success2);//false

        Student yourStd = new Student();
        String psycho3 = yourStd.getPsychologicalIssues();
        System.out.println("psycho3 = " + psycho3);//Depression



    }



}
