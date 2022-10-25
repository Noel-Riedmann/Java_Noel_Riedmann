package at.noel.OO.car;

public class Car {
    //Instanz / Gedächtins
    private int startFuelAmount;
    private int fuelAmount;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    // private cannot be accesed by user
    private  int amountFuelIntoMotor;

    // constructer
    public Car(int fc, String b, String s){
        this.fuelConsumption = fc;
        this.brand = b;
        this.serialNumber = s;
    };

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

    // Getter und Setter


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}


