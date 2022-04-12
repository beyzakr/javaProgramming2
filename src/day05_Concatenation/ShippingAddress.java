package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name="James King",
        buildingNumber="1123B",
                streetNmae="Jonas Branch Dr",
                city="Mclean",
                state="VA",
                zipCode="22031A";
        String address=name + "\n" + buildingNumber + " "+streetNmae + "\n"+ city + ", " +state +" "+ zipCode;
        System.out.println(address);


    }
}
