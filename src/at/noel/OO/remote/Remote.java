package at.noel.OO.remote;

public class Remote {
    private Battery battery;

    public void getStatus(){
        System.out.println(battery.getChargingStatus()*2/2);
    }

    public void turnOn(){
        battery.getChargingStatus() = battery.getChargingStatus() - 5;
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
