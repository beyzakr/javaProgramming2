package day43_Abstraction.employeeTask;

public final class Developer extends Employee{
    // it has to override all the abstract methods of employee class

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing the app");
    }


    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 6 hours");
    }
    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }
}
