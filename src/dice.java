import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        boolean isfinished = false;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Press 1 to start");

        while (!isfinished) {
            int selection = scanner.nextInt();
            int playerscore = 0;
            int outbot = 0;
            int numbot = 0;
            if (selection == 1) {
                for (int i = 1; i <= 6; i++) {
                    int num = random.nextInt(6) + 1;
                    System.out.println("Dice" + i + ": " + num);
                    playerscore = playerscore + num;

                }
                numbot = random.nextInt(31);
                outbot = numbot + 6;
                System.out.printf("Your score:  %d  %nBot's score: %d %n", playerscore, outbot);
                if (outbot < playerscore) {
                    System.out.println("You win!");
                }
                if (outbot > playerscore) {
                    System.out.println("Bot wins!");
                } else {
                    System.out.println("Draw");
                }
                System.out.println("1 = play again  2 = exit");

            }
            if (selection == 2) {
                isfinished = true;
            }
        }
    }
}
