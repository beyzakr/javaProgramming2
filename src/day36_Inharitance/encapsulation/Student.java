package day36_Inharitance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {

        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        if (age<5||age>90){
            return; // when this return statement gets executed? will this.age code fragment still gets executed?(it'll not)
            // that means instance variable age will not be set. return is terminate the program.
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (  !(gender=='F'||gender=='M')){
            return; // exits the methods
        }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        if (!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
            return;
        }
        this.grade = grade;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    // private , default , protected will their be any scenario that those access modifiers could be not visible.

    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
