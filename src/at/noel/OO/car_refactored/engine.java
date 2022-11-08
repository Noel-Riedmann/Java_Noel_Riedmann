package at.noel.OO.car_refactored;

public class engine {
    public enum TYPE{diesel, gasoline}
    private int horsepower;
    private TYPE type; //diesel or gasoline
    private int speed;

    public engine(int horsepower, TYPE type, int speed) {
        this.horsepower = horsepower;
        this.type = type;
        this.speed = speed;
    }
    //method drive

    public void drive(int amount){
        System.out.println("the motor is running with " + amount);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }
}
