package at.noel.OO.calculator;

public class CosinusCalculator extends BaseCalculator{
    private double num;

    public double cos(double num){
        return Math.round(Math.cos(num)*100.0)/100.0;
    }

}
