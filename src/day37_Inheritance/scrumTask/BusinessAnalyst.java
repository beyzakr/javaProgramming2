package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, char gender, int age, int id, double salary, String companyName) {
        super(name, gender, age, "Business Analyst", id, salary, companyName);
    }

    public void analyst(){
        System.out.println(name+" is analysing the documents");
    }

}
