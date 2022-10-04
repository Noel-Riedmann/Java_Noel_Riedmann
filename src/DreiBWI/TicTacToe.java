package DreiBWI;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        String playerChoice;

        // Welcome Text
        System.out.println(" ");
        System.out.println("*******************************");
        System.out.println("Welcome to TicTacToe");
        System.out.println("Player 1 = x and Player 2 = o");
        System.out.println("*******************************");
        System.out.println(" ");

        //Create Field
        char[][] field = new char[3][3];

        //Define a variable to define which players turn it is
        int roundValue = 0;

        //While loop
        while (!isFinished) {
            //Check which players turn it is
            if (roundValue % 2 == 0){
                playerChoice = "x";
                System.out.println("It's your turn Player1!");
            }
            else {
                playerChoice = "o";
                System.out.println("It's your turn Player2!");
            }

            //Get player Input

            System.out.println("Choose field: (0,0 - 2,2)");
            String input = scanner.next();

            //Split player Input
            String[] in = input.split(",");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);

            //Define field
            if (playerChoice.equalsIgnoreCase("x")) {
                field[x][y] = 'x';
            } else if (playerChoice.equalsIgnoreCase("o")) {
                field[x][y] = 'o';
            } else {
                System.out.println("Player choice was incorrect!");
            }

            //output char arr
            for (int i = 0; i < field.length; i++) {
                System.out.println(field[i]);
            }

            //Check whether game ended (one play won) or not
            //Check for equality or rows
            for (int i = 0; i < 3; i++) {
                if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][i] != 0){
                    isFinished = true;
                }
            }
            //Check for equality or columns
            for (int j = 0; j < 3; j++) {
                if (field[0][j] == field[1][j] && field[1][j] == field[2][j] && field[j][j] != 0){
                    isFinished = true;
                }
            }

            //Diagonals


            //change round value
            roundValue++;
        }
    }
}
