package at.noel.OO.car_refactored;

public class Main {
    public static void main(String[] args) {
        //build
        Wheel w1 = new Wheel(17, 1);
        Wheel w2 = new Wheel(17,1);
        Wheel w3 = new Wheel(17,1);
        Wheel w4 = new Wheel(17, 1);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(100, 10);
        Tank t1 = new Tank(100, 78);
        Engine e1 = new Engine(140, Engine.TYPE.gasoline, 90);
        Car c1 = new Car(e1,t1, "ford", "red");

        //add objects to List
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addWheel(w1);
        c1.addWheel(w2);
        c1.addWheel(w3);
        c1.addWheel(w4);

        //output
        c1.info();
        e1.drive();
    }
}

