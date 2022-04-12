package day37_Inheritance.scrumTask;

public class Person {
    // name age  gender

    public String name;
    public char gender;
    public int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
Create a class named Person
            variables:
                name, age, gender
            methods:
                eat(String food)
                drink(String drink)
                toString()
 */