package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Jimmy";
        String lastName = "Daniel";
        int age = 23;
        String jobTitle="Senior SDET";
        String companyName="Apple Inc";
double salary=10000.67;

        String fullName = firstName + " " + lastName;
        // full name of the person is...
        System.out.println("full name of the person is " + fullName);

        //...is...years old.
        System.out.println(fullName + " is " + age + " years old.");

        //fullName is jobTitle +, works at + companyName, and salary fullName's salary is Salary

        System.out.println(fullName + " is " + jobTitle +", works at " + companyName
                +", and "+fullName +"'s salary is $"+salary);




    }
}
