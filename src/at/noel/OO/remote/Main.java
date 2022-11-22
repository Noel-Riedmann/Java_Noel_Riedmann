package at.noel.OO.remote;

public class Main {
    public static void main(String[] args) {
        Remote r1 = new Remote();
        Battery b1 = new Battery(100);
        Battery b2 = new Battery(100);
        Battery b3 = new Battery(100);

        r1.addBattery(b1);
        r1.addBattery(b2);
        r1.addBattery(b3);
        r1.turnOn();

        System.out.println(b1.getChargingStatus());
        System.out.println(b2.getChargingStatus());
        System.out.println(b3.getChargingStatus());

        r1.getAvgChargingStatus();
        r1.turnOff();
    }
}
