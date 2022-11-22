package at.noel.OO.remote;

import java.util.Random;

public class Battery {
    private int chargingStatus;

    //create battery and give user the chance to change starting status
    public Battery(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    //function to change charging status when turning on the battery
    Random random = new Random();
    int deLoad = random.nextInt(5) + 1;

    public void turnOnBattery() {
        this.chargingStatus -= deLoad;
    }

    //getter
    public int getChargingStatus() {

        return chargingStatus;
    }

    //setter
    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

}
