package DreiBWI;
import java.util.Random;
import java.util.Scanner;

public class WordGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Word creation
        String WordOne = "Ambulance";
        char[] word = WordOne.toCharArray();
        for (int i = 0; i < WordOne.length(); i++) {
            int randomDecryption = random.nextInt(2);
            if (randomDecryption==0){
                word[i] = '*';
            }
            System.out.println(word[i]);
        }

        //Player guess
        System.out.println("Guess a letter");
        String playerGuess = scanner.next();

        for (int i = 0; i < WordOne.length(); i++) {
            String tmpStr = String.valueOf(word[i]);
            if (playerGuess.equalsIgnoreCase(tmpStr)){
                System.out.println(playerGuess);
            }
            else {
                System.out.println(word[i]);
            }
        }
    }
}
