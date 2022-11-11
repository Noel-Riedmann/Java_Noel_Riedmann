package at.noel.OO.car_refactored;

public class Tank {
    private int fuelAmount;
    private int maxFuel;

    public Tank(int maxFuel, int fuelAmount){
        this.maxFuel = maxFuel;
        this.fuelAmount = fuelAmount;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getMaxFuel() {
        return maxFuel;
    }
}

