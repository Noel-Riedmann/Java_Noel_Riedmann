package at.noel.OO.calculator;

public class SinusCalculator extends BaseCalculator{
    private double num;

    public double sin(double num){
        return Math.round(Math.sin(num)*100.0)/100.0;
    }
}
