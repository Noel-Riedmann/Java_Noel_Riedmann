package at.noel.arrays;

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

        // Choose player name
        System.out.println("Choose your name player 1:");
        String playerOneName = scanner.next();
        System.out.println("Choose your name player 2:");
        String playerTwoName = scanner.next();

        //Create Field
        char[][] field = new char[3][3];

        //Create empty spaces on field

        for (int i = 0; i < 3; i++) {
            field[0][i] = ' ';
            field[1][i] = ' ';
            field[2][i] = ' ';

        }


        //Define a variable to define which players turn it is
        int roundValue = 0;

        //While loop
        while (!isFinished) {

            //Check which players turn it is
            if (roundValue % 2 == 0) {
                playerChoice = "x";
                System.out.println(" ");
                System.out.println("It's your turn " + playerOneName + "!");
            } else {
                playerChoice = "o";
                System.out.println(" ");
                System.out.println("It's your turn " + playerTwoName + "!");
            }


            //Get player Input
            System.out.println("Choose field: x,y (1,1 - 3,3)");
            String input = scanner.next();

            //Split player Input (use -1 to show a field starting at 1,1)
            String[] in = input.split(",");
            int x = Integer.parseInt(in[0]) - 1;
            int y = Integer.parseInt(in[1]) - 1;

            //Check if field is already taken
            if (field[x][y] == 'x' || field[x][y] == 'o') {
                System.out.println("Field is already in use!");
            }


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

            //Check whether game ended (one player won) or not
            //Check for equality or rows
            for (int i = 0; i < 3; i++) {
                if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][i] != ' ') {
                    isFinished = true;
                    if (field[i][i] == 'x') {
                        System.out.println(playerOneName + " won!");
                    } else {
                        System.out.println(playerTwoName + " won!");
                    }
                }
            }
            //Check for equality or columns
            for (int j = 0; j < 3; j++) {
                if (field[0][j] == field[1][j] && field[1][j] == field[2][j] && field[j][j] != ' ') {
                    isFinished = true;
                    if (field[j][j] == 'x') {
                        System.out.println(playerOneName + " won!");
                    } else {
                        System.out.println(playerTwoName + " won!");

                    }
                }
            }


            //Diagonals
            if (field[0][0] == field[1][1] && field[0][0] == field[2][2] && field[1][1] != ' ') {
                isFinished = true;
                if (field[1][1] == 'x') {
                    System.out.println(playerOneName + " won!");
                } else {
                    System.out.println(playerTwoName + " won!");
                }
            } else if (field[0][2] == field[1][1] && field[0][2] == field[2][0] && field[1][1] != ' ') {

                isFinished = true;
                if (field[1][1] == 'x') {
                    System.out.println(playerOneName + " won!");
                } else {
                    System.out.println(playerTwoName + " won!");
                }
            }

            //For draw check if all fields are != ' '
            else if (field[0][0] != ' ' && field[0][1] != ' ' && field[0][2] != ' ' && field[1][0] != ' ' && field[1][1] != ' ' && field[1][2] != ' ' && field[2][0] != ' ' && field[2][1] != ' ' && field[2][2] != ' ') {
                isFinished = true;
                System.out.println("Game Draw!");

            }
            //change round value
            roundValue++;
        }
    }
}