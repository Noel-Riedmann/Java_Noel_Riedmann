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
        int randomWord = random.nextInt(5);
        String WordPool = "";
        int wrongTries = 0;

        //Wordpool creation
        switch (randomWord){
            case 0:
                WordPool = "ambulance";
                break;
            case 1:
                WordPool = "robot";
                break;
            case 2:
                WordPool = "java";
                break;
            case 3:
                WordPool = "hello world";
                break;
            case 4:
                WordPool = "coding";
                break;
            case 5:
                WordPool = "class";
                break;
        }

        //Word creation
        char[] word = WordPool.toCharArray();
        char[] fullWord = WordPool.toCharArray();
        for (int i = 0; i < WordPool.length(); i++) {
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

            for (int i = 0; i < WordPool.length(); i++) {
                String tmpStr = String.valueOf(fullWord[i]);
                if (playerGuess.equalsIgnoreCase(tmpStr)) {
                    System.out.println(playerGuess);
                    char[] tmpCharArray = playerGuess.toCharArray();
                    word[i] = tmpCharArray[0];
                } else {
                    System.out.println(word[i]);
                    wrongTries++;

                }
            }
            for (int i = 0; i < WordPool.length(); i++) {
                if (word[i] != '*') {
                    sum = sum + 1;
                }
            }
            if (sum == WordPool.length()) {
                System.out.println("You finished");
                isFinished = true;
            }
            else if (wrongTries == 12){
                System.out.println("You used all your tries!");
            }
            else {
                sum = 0;
            }
        }
    }
}

