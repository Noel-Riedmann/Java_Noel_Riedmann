package at.noel.OO.calculator;

import java.util.Scanner;

public class BasicMath {
    private double result = 0.0;

    public BasicMath() {
    }
    private Scanner scanner = new Scanner(System.in);

    public void start(){
        //introduction
        System.out.println("|--------------------------Calculator--------------------------|");
        System.out.println("Press + or - or * or / to choose your type of calculation");
        String userChoice = scanner.next();
        //all possible calculations
        if (userChoice.equalsIgnoreCase("+") || userChoice.equalsIgnoreCase("-") || userChoice.equalsIgnoreCase("*") || userChoice.equalsIgnoreCase("/")){
            switch (userChoice){
                case "+":
                    double addValue1;
                    if (result == 0.0) {
                        System.out.print("Enter 1st value: ");
                        addValue1 = scanner.nextDouble();
                    }
                    else {
                        addValue1 = result;
                        System.out.println("1st Value equals " + addValue1);
                    }
                    System.out.print("Enter 2nd value: ");
                    double addValue2 = scanner.nextDouble();
                    result = addValue1 + addValue2;
                    System.out.println(addValue1 + " + " + addValue2 + " = " + result);
                    break;
                case "-":
                    double subValue1;
                    if (result == 0.0) {
                        System.out.print("Enter 1st value: ");
                        subValue1 = scanner.nextDouble();
                    }
                    else {
                        subValue1 = result;
                        System.out.println("1st Value equals " + subValue1);
                    }
                    System.out.print("Enter 2nd value: ");
                    double subValue2 = scanner.nextDouble();
                    result = subValue1 - subValue2;
                    System.out.println(subValue1 + " - " + subValue2 + " = " + result);
                    break;
                case "*":
                    double mulValue1;
                    if (result == 0.0) {
                        System.out.print("Enter 1st value: ");
                        mulValue1 = scanner.nextDouble();
                    }
                    else {
                        mulValue1 = result;
                        System.out.println("1st Value equals " + mulValue1);
                    }
                    System.out.print("Enter 2nd value: ");
                    double mulValue2 = scanner.nextDouble();
                    result = mulValue1 * mulValue2;
                    System.out.println(mulValue1 + " * " + mulValue2 + " = " + result);
                    break;
                case "/":
                    double divValue1;
                    if (result == 0.0) {
                        System.out.print("Enter 1st value: ");
                        divValue1 = scanner.nextDouble();
                    }
                    else {
                        divValue1 = result;
                        System.out.println("1st Value equals " + divValue1);
                    }
                    System.out.print("Enter 2nd value: ");
                    double divValue2 = scanner.nextDouble();
                    result = divValue1 / divValue2;
                    double roundedResult = Math.round(result*100.0)/100.0;
                    System.out.println(divValue1 + " / " + divValue2 + " = " + roundedResult);
                    break;
            }
        }
        else {
            System.out.println("Invalid Input!");
            start();
        }
        //ask user to continue
        System.out.println("Do you want to continue with saved result (" + result + ") [Y/N]");
        String userContinue = scanner.next();
        if (userContinue.equalsIgnoreCase("y")){
            start();
        }
        else if (userContinue.equalsIgnoreCase("n")){
            System.out.println("Do you want to continue without saved result else the code will be exited [Y/N]");
            userContinue = scanner.next();
            if (userContinue.equalsIgnoreCase("y")){
                result = 0.0;
                start();
            }
            else {
                System.out.println("Goodbye");
                System.exit(69);

            }
        }
    }


}
