package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("A person", 3202, 'F', "Developer", 100000, true);
        employee2.setInfo("B person", 3203, 'M', "Doctor", 60000, true);
        employee3.setInfo("C person", 3204, 'F', "QA", 80000, false);
        employee4.setInfo("D person", 3205, 'M', "QA", 75000, true);
        employee5.setInfo("E person", 3206, 'F', "Nurse", 5000, true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        int countFullTime = 0;
        int countPartTime = 0;

        double max=employees[0].salary;
        double min=employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime) {
                countFullTime++;
            } else {
                countPartTime++;
            }

            if (employee.salary>max){
                max=employee.salary;
            }

            if (employee.salary<min){
                min=employee.salary;
            }
        }


        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
/*
CapitalOne Class:
	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */