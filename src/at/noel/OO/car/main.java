package at.noel.OO.car;

public class main {
    public static void main(String[] args) {

        Car c1 = new Car(12, "Audi", "RS750");
        /* not needed when using a constructer
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "RS750";
        c1.startFuelAmount = 70;
        c1.fuelAmount = 70;
        */

        //Getter and Setter
        Car c2 = new Car(1,"Opel", "RS24");
            c2.setBrand("Audi");
            c2.setFuelAmount(7);
            c2.setSerialNumber("RS24");

        for (int i = 0; i < 3; i++) {
            c1.drive();
            c1.turboBoost();
        }
        c1.honk(3);
        c1.getRemainingRange();

        //Getter und Setter
        System.out.println(c2.getBrand());





    }
}
