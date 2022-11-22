package at.noel.OO.cars;

import java.util.Random;

public class Producer {
    Random random = new Random();
    private String name;
    private String country;
    private int discount;
    public Producer(String name, String country){
        this.name = name;
        this.country = country;
        this.discount = random.nextInt(30) + 10;
    }
}
