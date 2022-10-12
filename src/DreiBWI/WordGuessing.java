package DreiBWI;

import java.util.Random;
import java.util.Scanner;

public class WordGuessing {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isFinished = false;
        int sum = 0;

        //Word creation
        String WordOne = "Ambulance";
        char[] word = WordOne.toCharArray();
        char[] fullWord = WordOne.toCharArray();
        for (int i = 0; i < WordOne.length(); i++) {
            int randomDecryption = random.nextInt(2);
            if (randomDecryption == 0) {
                word[i] = '*';
            }
            System.out.println(word[i]);
        }
        while (!isFinished) {
            //Player guess
            System.out.println("Guess a letter");
            String playerGuess = scanner.next();

            for (int i = 0; i < WordOne.length(); i++) {
                String tmpStr = String.valueOf(fullWord[i]);
                if (playerGuess.equalsIgnoreCase(tmpStr)) {
                    System.out.println(playerGuess);
                    char[] tmpCharArray = playerGuess.toCharArray();
                    word[i] = tmpCharArray[0];
                } else {
                    System.out.println(word[i]);
                }
            }
            for (int i = 0; i < WordOne.length(); i++) {
                if (word[i] != '*') {
                    sum = sum + 1;
                }
            }
            if (sum == WordOne.length()) {
                System.out.println("You finished");
                isFinished = true;
            } else {
                sum = 0;
            }
        }
    }
}

