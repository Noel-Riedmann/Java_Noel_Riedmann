package at.noel.OO.car;

public class Car {
    //Instanz / Gedächtins
    public int startFuelAmount;
    public int fuelAmount;
    public int fuelConsumption;
    public String brand;
    public String serialNumber;

    //Methode
    public void drive() {
        if (fuelAmount >= fuelConsumption) {
            this.fuelAmount = this.fuelAmount - fuelConsumption;
            System.out.println("I'm driving");
        } else {
            System.out.println("not enough fuel to drive");
        }
    }

    public void turboBoost() {
        if (startFuelAmount / 100 * 10 < fuelAmount) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i <= amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange() {
        System.out.println(fuelAmount);
    }
}


