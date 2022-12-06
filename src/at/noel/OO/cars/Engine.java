package at.noel.OO.cars;

import java.util.Random;

public class Engine {
    Random random = new Random();
    private int HorsePower;
    public enum TYPE{diesel, gasoline}
    private TYPE typeOfFuel; //diesel or gasoline
    private int mileage;
    private double fuelConsumption;

    public Engine(int HorsePower, TYPE typeOfFuel, int mileage){
        this.HorsePower = HorsePower;
        this.typeOfFuel = typeOfFuel;
        this.mileage = mileage;
        this.fuelConsumption = random.nextDouble(5) + 5;
    }

    public void checkFuelConsumption(){
        if (this.mileage <= 50000){
            System.out.println("The current fuel consumption is at " + fuelConsumption);
        }
        else {
            this.fuelConsumption *= 1.098;
            System.out.println(fuelConsumption);
        }
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public TYPE getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(TYPE typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}


