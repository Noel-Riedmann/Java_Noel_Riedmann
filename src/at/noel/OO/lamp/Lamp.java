package at.noel.OO.lamp;

import at.noel.OO.remote.Battery;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<GlowElement> GlowElements;
    private int overallPowerConsumption;
    public Lamp() {
        this.GlowElements = new ArrayList<>();
    }

    //function to turn on All elements
    public void turnAllOn(){
        for (int i = 0; i < GlowElements.size(); i++) {
            this.GlowElements.get(i).addLightElement();
            System.out.println(this.GlowElements.get(i).getName() + " is turned on");
        }
    }

    //function to add glowElement to specific lamp
    public void addGlowElement(GlowElement glowElement){
        this.GlowElements.add(glowElement);
    }

    //function to get overall power usage
    public void getOverallPowerUsage(){
        System.out.println("We already used " + (overallPowerConsumption -= GlowElements.size() * 5 *-1) + " power");
    }

    //function to get name of all existing GE's
    public void printNamesOfLightElements(){
        System.out.println("|--------------------Names--------------------|");
        for (int i = 0; i < GlowElements.size(); i++) {
            System.out.println("GlowElement " +(i+1) + "'s name is " + this.GlowElements.get(i).getName() + "." );
        }
        System.out.println("|---------------------------------------------|");
    }
}
