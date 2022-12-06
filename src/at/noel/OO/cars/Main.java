package at.noel.OO.cars;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("gray", 180, 20000);
        Engine e1 = new Engine(200, Engine.TYPE.gasoline, 60000);
        Producer producer = new Producer("porsche", "germany");

        //get information
        producer.producerInfo();
        e1.engineInfo();
        c1.carInfo();


        e1.checkFuelConsumption();
        c1.getPrice();

    }

}
