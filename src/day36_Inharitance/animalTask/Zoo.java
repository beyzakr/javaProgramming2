package day36_Inharitance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2,"S","White");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        //dog.hunt();
        //dog.scratch();
        dog.bark();
        System.out.println(dog);
        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","Gray");
        cat.eat();
        cat.sleep();
        cat.sleep();
        cat.drink();
        cat.move();
        //cat.bark();
        //cat.hunt();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","Red");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);
    }






}
