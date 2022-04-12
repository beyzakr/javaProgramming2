package day37_Inheritance.scrumTask;

public class AmazonInch {

    public static void main(String[] args) {

        String company="Amazon";

        ProductOwner po = new ProductOwner("Suhaib", 'M', 29,1,160000, company);
        BusinessAnalyst ba = new BusinessAnalyst("banu",'F',24,432,10000,company);
        ScrumMaster sm = new ScrumMaster("dhdh",'M',43,543,567443,company);

        Tester t1= new Tester("a",'M',32,"QA",3456,120000,company);
        Tester t2= new Tester("b",'F',31,"QE",3456,120000,company);
        Tester t3= new Tester("c",'M',30,"SDET",3456,120000,company);
        Tester t4= new Tester("d",'F',29,"QA",3456,120000,company);
        Tester[] testers = {t1,t2,t3,t4};

        Developer d1 = new Developer("e",'F',45,"Senior Java Developer",909,500000,company);
        Developer d2 = new Developer("f",'M',23,"Junior Java Developer",908,200000,company);
        Developer d3 = new Developer("g",'F',45,"Senior Java Developer",907,500000,company);
        Developer d4 = new Developer("h",'M',45,"Fullstack Java Developer",906,100000,company);
        Developer[] developers = {d1,d2,d3,d4};

        ScrumTeam st = new ScrumTeam(po,ba,sm);

        st.addDevelopers(developers);
        st.addTesters(testers);

        System.out.println(st);

        System.out.println("-------------------");

        for (Tester tester : st.testers) {
            System.out.println(tester.name+" : "+tester.salary);
        }

        for (Developer developer : st.developers) {
            System.out.println(developer.name+" : "+developer.salary);
        }





    }
}
