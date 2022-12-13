package at.noel.OO.lamp;

public class GlowElement {
    private String name;
    private String colour;
    private int energyConsumption;
    private int energy = 100;
    private boolean isOn = false;

    public GlowElement(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    // energy will go down -5 everytime it will be turned on again can't be turned on if it's already on
    public void addLightElement(){
        if (isOn){
            System.out.println("My name is " + name + ". I'm already turned on!");
        }
        else {
            isOn = true;
            energy -= 5;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
