package at.noel.OO.geometricFigures;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void getArea(){
        double area = (radius * radius) * Math.PI;
        System.out.println("---------Circle---------");
        System.out.println("Area is: " + Math.round(area *100.0)/100.0);
    }
}
