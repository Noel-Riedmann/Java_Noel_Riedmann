package at.noel.OO.remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;

    //constructor
    public Remote() {
        this.batteries = new ArrayList<>();
    }

    // turnOn for user to use works together with this.batteries.turnOn
    public void turnOn() {
        for (int i = 0; i < batteries.size(); i++) {
            System.out.println("Consumer " + i + " connected");
            this.batteries.get(i).turnOnBattery();
        }
    }

    //turnOff for letting user know that there is no more battery connected
    public void turnOff(){
        for (int i = 0; i < batteries.size(); i++) {
            System.out.println("Consumer " + i + " disconnected");
        }
    }

    //function to get average charging status
    public void getAvgChargingStatus(){
        int avgChargingStatus = 0;
        for (int i = 0; i < batteries.size(); i++) {
            avgChargingStatus += this.batteries.get(i).getChargingStatus();
        }
        System.out.println("The average load of all batteries combined is: "  + avgChargingStatus / batteries.size());
    }

    //function to add multiple batteries
    public void addBattery(Battery battery){
        this.batteries.add(battery);
    }

    //getter
    public List<Battery> getBatteries() {
        return batteries;
    }
}
