package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, char gender, int age, int id, double salary, String companyName) {
        super(name, gender, age, "Product Owner", id, salary, companyName);
    }

}
