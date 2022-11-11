package at.noel.OO.car_refactored;

import java.util.ArrayList;
import java.util.List;

public class Car {
    // Creating car
    private Engine engine;
    private Tank tank;
    private String brand;
    private String serialNumber;
    private String color;
    private int fuelConsumption;
    private List<RearMirror> mirrors;
    private List<Wheel> wheels;

    //Method
    public void info() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Horsepower: " + this.getEngine().getHorsepower());
        System.out.println("Max Fuel: " + this.getTank().getMaxFuel());
        System.out.println("Fuel Amount: " + this.getTank().getFuelAmount());
        System.out.println("Mirror-0 position:" + this.getMirrors().get(0).getPosition() + " size:" + this.getMirrors().get(0).getSize());
        System.out.println("Mirror-1 position:" + this.getMirrors().get(1).getPosition() + " size:" + this.getMirrors().get(1).getSize());
        System.out.println("Wheels: " + this.getWheels().get(0).getDiameter() + "″ & " + this.getWheels().get(1).getAge() + " year(s) old");
    }

    //Constructor
    public Car(Engine engine, Tank tank, String b, String c) {
        this.brand = b;
        this.color = c;
        this.engine = engine;
        this.tank = tank;
        this.mirrors = new ArrayList<>();
        this.wheels = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public void addWheel(Wheel wheel) {
        this.wheels.add(wheel);
    }
//Allowing user to change values


    public List<Wheel> getWheels() {
        return wheels;
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
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

    public Engine getEngine() {
        return engine;
    }

    public Tank getTank() {
        return tank;
    }
}
