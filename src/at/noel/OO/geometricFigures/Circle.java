package at.noel.OO.geometricFigures;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        area = (radius * radius) * Math.PI;
        System.out.println("---------Circle---------");
        System.out.println("Area is: " + Math.round(area*100.0)/100.0);
        return area;
    }
}
