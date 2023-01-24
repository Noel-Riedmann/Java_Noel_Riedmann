package at.noel.OO.geometricFigures;

public class Square {
    private double side;
    private double area;

    public Square(double side) {
        this.side = side;
    }

    public double getArea(){
        area = side*side;
        System.out.println("---------Square---------");
        System.out.println("Area is: " + Math.round(area*100.0)/100.0);
        return area;
    }
}
