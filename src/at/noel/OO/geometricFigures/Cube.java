package at.noel.OO.geometricFigures;

public class Cube {
    private double side;
    private double area;
    private double volume;

    public Cube(double side) {
        this.side = side;
    }

    public double getArea(){
        area = 6 * (side*side);
        System.out.println("----------Cube----------");
        System.out.println("Area is: " + Math.round(area*100.0)/100.0);
        return area;
    }

    public double getVolume(){
        volume = Math.pow(side, 3.0);
        System.out.println("Volume is: " + Math.round(volume*100.0)/100.0);
        return volume;
    }
}
