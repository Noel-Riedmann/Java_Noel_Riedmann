import java.util.Random;

public class Test_Example_2 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;
        int num;
        int value = 0;
        while (!isFinished) {
            num = random.nextInt(11);
            System.out.println(num);
            value = value + num;
            if (num == 5) {
                isFinished = true;
            }
        }
        System.out.println("Summe: " + value);
    }
}
