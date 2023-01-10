package at.noel.OO.calculator;

import java.util.Scanner;

public class BasicMath {
    private double result;

    public BasicMath() {
    }
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("|--------------------------Calculator--------------------------|");
        System.out.println("-Press 1 to do basic calculation types");
        System.out.println("-Press 2 to do sinus or cosinus");
        System.out.println("-Press 3 to do square roots");
        System.out.println("-Press 9 to exit");
        int userInput = scanner.nextInt();

        switch(userInput){
            case 1:
                basicCalculationTypes();
                break;
            case 2:
                System.out.println("NA yet");
                break;
            case 3:
                System.out.println("NA yet");
                break;
            case 9:
                break;
        }
    }
    public void basicCalculationTypes(){
        System.out.println("|--------------------------Calculator--------------------------|");
        System.out.println("Press + or - or * or / to choose your type of calculation");
        String userChoice = scanner.next();
        switch (userChoice){
            case "+":
                System.out.print("Enter 1st value: ");
                double addValue1 = scanner.nextDouble();
                System.out.print("Enter 2nd value: ");
                double addValue2 = scanner.nextDouble();
                result = addValue1 + addValue2;
                System.out.println(addValue1 + " + " + addValue2 + " = " + result);
                break;
            case "-":
                System.out.print("Enter 1st value: ");
                double subValue1 = scanner.nextDouble();
                System.out.print("Enter 2nd value: ");
                double subValue2 = scanner.nextDouble();
                result = subValue1 - subValue2;
                System.out.println(subValue1 + " - " + subValue2 + " = " + result);
                break;
            case "*":
                System.out.print("Enter 1st value: ");
                double mulValue1 = scanner.nextDouble();
                System.out.print("Enter 2nd value: ");
                double mulValue2 = scanner.nextDouble();
                result = mulValue1 * mulValue2;
                System.out.println(mulValue1 + " * " + mulValue2 + " = " + result);
                break;
            case "/":
                System.out.print("Enter 1st value: ");
                double divValue1 = scanner.nextDouble();
                System.out.print("Enter 2nd value: ");
                double divValue2 = scanner.nextDouble();
                result = divValue1 / divValue2;
                double roundedResult = Math.round(result*100.0)/100.0;
                System.out.println(divValue1 + " / " + divValue2 + " = " + roundedResult);
                break;
        }
    }


}
