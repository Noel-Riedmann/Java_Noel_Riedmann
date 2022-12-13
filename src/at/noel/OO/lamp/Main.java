package at.noel.OO.lamp;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        GlowElement GE1 = new GlowElement("GE1", "red");
        GlowElement GE2 = new GlowElement("GE2", "blue");

        lamp.addGlowElement(GE1);
        lamp.addGlowElement(GE2);

        lamp.turnAllOn();

        GE1.addLightElement();
        lamp.printNamesOfLightElements();

        lamp.getOverallPowerUsage();
    }
}
