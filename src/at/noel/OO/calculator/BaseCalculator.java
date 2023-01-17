package at.noel.OO.calculator;

public class BaseCalculator {

    private double num1;
    private double num2;

    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double sub(double num1, double num2){
        return num1 - num2;
    }

    public double div(double num1, double num2){
        return Math.round(num1/num2*100.0)/100.0;
    }

    public double mul(double num1, double num2){
        return num1 * num2;
    }

}
