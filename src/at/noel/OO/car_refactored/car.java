package at.noel.OO.car_refactored;

public class car {
    // Creating car
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private int fuelConsumption;

    //Method
    public void driving(){
        if (fuelAmount >= fuelConsumption){
            fuelAmount = fuelAmount - fuelConsumption;
            System.out.println("we can still drive");
        }
        else{
            System.out.println("we don't have any fuel left :c");
        }
    }

    //Constructor
    public car(int fA, String b, String c){
        this.fuelAmount = fA;
        this.brand = b;
        this.color = c;
    }

    //Allowing user to change values

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
