package at.noel.OO.cars;


public class Car {
    private String color;
    private int maxSpeed;
    private int basePrice;
    private Producer producer;

    //constructor
    public Car(String color, int maxSpeed, int basePrice) {
        this.basePrice = basePrice;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void getPrice(){
        this.basePrice = basePrice - producer.getDiscount;
        System.out.println(basePrice);
    }
}
