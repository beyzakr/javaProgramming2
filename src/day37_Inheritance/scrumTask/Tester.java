package day37_Inheritance.scrumTask;

public class Tester extends Employee{ //Tester IS A Employee,  Tester IS A Person
    public Tester(String name, char gender, int age, String jobTitle, int id, double salary, String companyName) {
        super(name, gender, age, jobTitle, id, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + "is creating ticket");
    }

}
