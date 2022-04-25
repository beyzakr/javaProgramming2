package day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {

 //Car car1 = new Car("cydeo","25","blue",2022,100000);
        // we can not create object from abstract class, bcs abstract class is not concrete


        Honda honda = new Honda("accord","black",2019,30000);

        Audi audi = new Audi("Q7","blue",2020,45000);

        Tesla tesla = new Tesla("Model3","white",2021,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-------------");

        honda.setColor("red");
        audi.setColor("pink");
        tesla.setColor("green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);



        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);




    }
}
