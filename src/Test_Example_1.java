import java.util.Random;

public class Test_Example_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int value1 = random.nextInt(1001);
        int value2 = random.nextInt(1001);
        System.out.println("value1: " + value1 + " value2: " + value2);

        if (value1 > value2) {
            for (int i = value1; i >= value2; i--) {
                System.out.println(i);
            }
        } else if (value1 < value2) {
            for (int o = value2; o >= value1; o--) {
                System.out.println(o);
            }
        }
        else if(value1==value2){
            System.out.println("Tie: " + value1);
        }
    }
}
