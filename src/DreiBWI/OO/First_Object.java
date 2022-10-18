package DreiBWI.OO;

public class First_Object {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "RS750";
        c1.fuelAmount = 70;


        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);

        System.out.println("  \uD83C\uDFCE️ ");

    }
}
