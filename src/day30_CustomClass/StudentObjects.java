package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Beyza", 'F', 24, 123, 'A');


        Student student2 = new Student();
        student2.setInfo("Sena", 'F', 24, 409, 'A');


        Student student3 = new Student();
        student3.setInfo("Mehmet", 'M', 24, 953, 'F');


        Student student4 = new Student();
        student4.setInfo("Carlos", 'M', 25, 6690, 'B');

        Student student5 = new Student();
        student5.setInfo("Dilara", 'F', 22, 2278, 'C');


        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println(student);
        }
            System.out.println("---------------------------------------------------------");


            ArrayList<Student> earlyBirds = new ArrayList<>(); //grade:A
            ArrayList<Student> angryBirds = new ArrayList<>(); //

            for (Student student : students) {
                if (student.grade=='A'){
                    earlyBirds.add(student);
                }else{
                    angryBirds.add(student);
                }
            }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);



    }
}
