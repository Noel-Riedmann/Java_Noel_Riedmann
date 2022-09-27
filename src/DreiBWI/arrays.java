package DreiBWI;

import java.util.Random;

public class arrays {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        int number;

        for (int i = 0; i < 10; i++) {
            number = random.nextInt(10);
            array[i] = number;
            System.out.print(array[i] + " ");
        }
    }
}
