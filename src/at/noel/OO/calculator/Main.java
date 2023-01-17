package at.noel.OO.calculator;

public class Main {
    public static void main(String[] args) {

        BaseCalculator b = new BaseCalculator();
        SinusCalculator s = new SinusCalculator();
        CosinusCalculator c = new CosinusCalculator();
        RootCalculator r = new RootCalculator();


        System.out.println(b.div(10, 3) + " " + s.sin(45)+ " " + c.cos(180) + " " + r.root(81));

    }
}
