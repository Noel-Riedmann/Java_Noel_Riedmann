package at.noel.OO.geometricFigures;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(100);
        circle1.getArea();

        Rectangle rectangle1 = new Rectangle(100, 50);
        rectangle1.getArea();

        Square square1 = new Square(10);
        square1.getArea();

        Cube cube1 = new Cube(10);
        cube1.getArea();
        cube1.getVolume();
    }
}
