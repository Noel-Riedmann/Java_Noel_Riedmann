package at.noel.OO.cars;


public class Car {
    private String color;
    private int maxSpeed;
    private int basePrice;

    //constructor
    public Car(String color, int maxSpeed, int basePrice) {
        this.basePrice = basePrice;
        this.maxSpeed = maxSpeed;
        this.color = color;
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
        this.basePrice = basePrice - Producer.getDiscount();
        System.out.println("The price of the car: " + basePrice + "€");
    }
}


