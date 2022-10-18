package at.noel.basics;

import java.util.Scanner;

public class caesar {
    private static String string;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type text to encrypt now!");
        String text = scanner.nextLine();
        int shift = 2;
        String caesarText = "";
        char alphabet;

        for (int i = 0; i < text.length(); i++) {
            alphabet = text.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {

                alphabet = (char) (alphabet + shift);

                if (alphabet > 'z') {

                    alphabet = (char) (alphabet + 'a' - 'z');
                }
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);


                if (alphabet > 'Z') {

                    alphabet = (char)
                            (alphabet + 'A' - 'Z');
                }
                caesarText = caesarText + alphabet;
            } else {
                caesarText = caesarText + alphabet;
            }

        }
        System.out.println("Encryption: " + caesarText);
    }
}


