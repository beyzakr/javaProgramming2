package day44_Abstraction.animalTask;

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreath;

    static{
        canBreath=true;

    }

    /*
    if the Instance variables are final when
    can you u use the Instance variable? you have object first
    you do have a constructor to set them
     */

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name); // you can add some conditions  if isEmpty / is blank in set. but this.name you can not add
        this.breed = breed;
        if (!(gender=='M' || gender == 'F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }



    public final void drink(){ // make sure that this method is Instance. all the classes they do have same step
        // for completing this action
        System.out.println(name+"  is drinking water");
    }

    public abstract void eat();

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
