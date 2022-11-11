package at.noel.OO.car_refactored;

public class Engine {
    public enum TYPE{diesel, gasoline}
    private int horsepower;
    private TYPE type; //diesel or gasoline
    private int speed;

    public Engine(int horsepower, TYPE type, int speed) {
        this.horsepower = horsepower;
        this.type = type;
        this.speed = speed;
    }
    //method drive

    public void drive(){
        if (speed <= 100 && speed >= 1){System.out.println("The motor is running at " + speed + "kph");}else{System.out.println("Speed has to be higher then 0 and slower then 101");}}

    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }
}
