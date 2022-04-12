package day30_CustomClass;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int id;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, int ID, char gender, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }
}
