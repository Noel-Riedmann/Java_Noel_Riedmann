package at.noel.OO.calculator;

public class RootCalculator extends BaseCalculator{
    private double num;

    public double root(double num){
        return Math.round(Math.sqrt(num)*100.0)/100.0;
    }
}
