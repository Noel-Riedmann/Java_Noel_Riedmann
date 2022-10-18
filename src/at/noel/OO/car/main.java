package at.noel.OO.car;

public class main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "RS750";
        c1.startFuelAmount = 70;
        c1.fuelAmount = 70;

        for (int i = 0; i < 3; i++) {
            c1.drive();
            c1.turboBoost();
        }
        c1.honk(3);
        c1.getRemainingRange();



    }
}
