package at.noel.OO.geometricFigures;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void getArea(){
        double area = width * height;
        System.out.println("-------Rectangle-------");
        System.out.println("Area is: " + Math.round(area *100.0)/100.0);
    }
}
