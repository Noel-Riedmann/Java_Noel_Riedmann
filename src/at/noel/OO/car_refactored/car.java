package at.noel.OO.car_refactored;

public class car {
    // Creating car
    private engine engine;
    private tank tank;
    private String brand;
    private String serialNumber;
    private String color;
    private int fuelConsumption;

    //Method
    public void info(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Horsepower: " + this.getEngine().getHorsepower());
        System.out.println("Max Fuel: " + this.getTank().getMaxFuel());
        System.out.println("Fuel Amount: " + this.getTank().getFuelAmount());

    }

    //Constructor
    public car(engine engine, tank tank, String b, String c){
        this.brand = b;
        this.color = c;
        this.engine = engine;
        this.tank = tank;
    }

    //Allowing user to change values

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

    public at.noel.OO.car_refactored.engine getEngine() {
        return engine;
    }

    public at.noel.OO.car_refactored.tank getTank() {
        return tank;
    }
}
