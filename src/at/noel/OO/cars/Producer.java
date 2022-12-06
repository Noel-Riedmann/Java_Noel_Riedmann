package at.noel.OO.cars;

import java.util.Random;

public class Producer {
    Random random = new Random();
    private String name;
    private String country;
    private int discount;

    //constructor
    public Producer(String name, String country){
        this.name = name;
        this.country = country;
        this.discount = random.nextInt(30) + 10;
    }

    //make info available for user
    public void producerInfo(){
        System.out.println("---------------Producer---------------");
        System.out.println("name: " + this.name);
        System.out.println("country: " + this.country);
        System.out.println("discount: " + getDiscount());
        System.out.println("--------------------------------------");
    }

    public  int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
