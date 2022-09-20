import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class CrossSum4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean whileTrue = true;
        System.out.println("Press 1 to Start and 2 to End");
        while (whileTrue) {
            int selection = scan.nextInt();

            // Get input and convert it to array
            if (selection == 1) {

                boolean whileTrue2 = true;
                System.out.println("Type number: ");
                int selectionCrossSum = scan.nextInt();
                while (whileTrue2){
                String numberInString = Integer.toString(selectionCrossSum);
                char[] numbers = numberInString.toCharArray();

                //set sum to 0 and calc crosssum
                int sum = 0;
                for (int i = 0; i < numbers.length; i++) {
                    sum = sum + Character.getNumericValue(numbers[i]);

                }

                //Print value and text to play again
                System.out.println(sum);

                if (sum >= 10) {
                    selectionCrossSum = sum;

                }
                if (sum < 10) {
                    System.out.println("Press 1 to play again or 2 to stop!");
                    whileTrue2 = false;
                }
            }}

            //End boolean to end the program
            if (selection == 2) {
                whileTrue = false;
            }}
        }
    }

