package at.noel.OO.car_refactored;

public class Wheel {
    int diameter; //durchmesser
    int age; //in years

    public Wheel(int diameter, int age){
        this.diameter = diameter;
        this.age = age;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getAge() {
        return age;
    }
}
