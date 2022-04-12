package day04_Variables;

public class Currencies {
    public static void main(String[] args) {

        int dollar=1000;


        double won=dollar*11.27;
        double lira= dollar*13.44;
        double euro=dollar*15.32;
        double pound=dollar*18.34;

        System.out.println("$ =" + dollar);
        System.out.println("W =" + won);
        System.out.println("₺ =" + lira);
        System.out.println("€ =" + euro);
        System.out.println("£ =" + pound);

    }
}
