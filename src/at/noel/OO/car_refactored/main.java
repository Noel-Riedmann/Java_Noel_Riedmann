package at.noel.OO.car_refactored;

public class main {
    public static void main(String[] args) {
        //build
        tank t1 = new tank(100, 78);
        engine e1 = new engine(140, engine.TYPE.gasoline);
        car c1 = new car(e1,t1, "ford", "red");

        //output
        c1.info();
    }
}

