package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Demir",25,'M',37483,"Senior Developer",150000);

        Tester tester= new Tester("Alya",23,'F',23344,"SDET",100000);

        Teacher teacher = new Teacher("Oktay",45,'M',988,"Math teacher",90000);

        Student student = new Student("Beyza",23,'F',123,"java");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("-----------------------------");


        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("------------------------------");

        developer.work();
        tester.work();
        teacher.work();
        System.out.println("-----------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("-----------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTicket();
        System.out.println("-----------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("-----------------------------");

        student.eat();
        student.drink();
        student.sleep();

        student.study();




    }
}
