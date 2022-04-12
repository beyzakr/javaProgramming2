package day37_Inheritance.scrumTask;

public class Employee extends Person{ // Employee IS A Person

   // public String name;
   // public char gender;
   // public int age;
    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    public Employee(String name, char gender, int age, String jobTitle, int id, double salary, String companyName) {
        super(name, gender, age);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary=salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }


}
/*
name, gender, age, jobTitle, id, salary, companyName
 work(), toString()
 */