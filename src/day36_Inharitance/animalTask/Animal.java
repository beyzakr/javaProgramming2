package day36_Inharitance.animalTask;

public class Animal {

    public String name, breed;
    public char gender;
    public int age;
    public String zie;
    public String color;

    public void setInfo(String name, String breed, char gender, int age, String zie, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.zie = zie;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void move(){
        System.out.println(name+" is moving");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", zie='" + zie + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
