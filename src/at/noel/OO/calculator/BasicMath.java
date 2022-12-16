package at.noel.OO.calculator;

import java.util.Scanner;

public class BasicMath {

    public BasicMath() {
    }
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("|----------------Calculator----------------|");
        System.out.println("-Press 1 to do basic calculation types");
        System.out.println("-Press 2 to do sinus or cosinus");
        System.out.println("-Press 3 to do square roots");
        System.out.println("-Press 9 to exit");
        int userInput = scanner.nextInt();
    }
    public void basicCalculationTypes(){
        System.out.println("|----------------Calculator----------------|");
        System.out.println("Press + or - or * or / to choose your type of calculation");
        String userChoice = scanner.next();
    }


}
