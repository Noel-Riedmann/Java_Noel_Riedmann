package at.noel.OO.car_refactored;

public class main {
    public static void main(String[] args) {
        car opel = new car(30, "opel", "red"){};
        opel.setFuelConsumption(11);

        //output
        System.out.println(opel.getFuelConsumption());

        for (int i = 0; i < 3; i++) {
            opel.driving();
            System.out.println(opel.getFuelAmount());
        }
    }
}
