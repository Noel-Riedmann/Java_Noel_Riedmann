import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        boolean isfinished = false;
        Scanner scanner = new Scanner(System.in);

        while (!isfinished) {
            int selection = scanner.nextInt();
            if (selection == 4) {
                isfinished = true;
            }
        }
    }
}
