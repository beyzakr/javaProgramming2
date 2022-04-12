package day05_Concatenation;

public class CarInfo {

    public static void main(String[] args) {

        String year="2018",
                make="Toyota",
                model="Camry",
                miles="50000 miles",
                color="Red",
                price="$19000.";

        String carInfo= year +" "+ make +" "+ model + ", " + miles +", "+ color +", "+ price;
        System.out.println(carInfo);

    }
}
