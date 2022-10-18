package DreiBWI.OO;

public class Car {
    //Instanz / Gedächtins
    public int fuelAmount;
    public int fuelConsumption;
    public String brand;
    public String serialNumber;

    //Methode
    public  void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I'm driving");
    }
}


