package day37_Inheritance.scrumTask;

public class Developer extends Employee{

    public Developer(String name, char gender, int age, String jobTitle, int id, double salary, String companyName) {
        super(name, gender, age, "Developer", id, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }
}
