package at.noel.OO.cars;


public class Car {
    private String color;
    private int maxSpeed;
    private int basePrice;
    private Producer producer;


    //constructor
    public Car(String color, int maxSpeed, int basePrice, Producer producer) {
        this.basePrice = basePrice;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.producer = producer;
    }
    //make info available for user
    public void carInfo(){
        System.out.println("-----------------Car-----------------");
        System.out.println("color: " + this.color);
        System.out.println("maxspeed: " + this.maxSpeed);
        System.out.println("baseprice: " + this.basePrice);
        System.out.println("-------------------------------------");
    }


    public void getPrice(){
        this.basePrice = basePrice - producer.getDiscount();
        System.out.println("The price of the car: " + basePrice + "€");
    }
}


