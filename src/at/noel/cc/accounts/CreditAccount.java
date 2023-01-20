package at.noel.cc.accounts;

public class CreditAccount extends BaseAccount{
    private double creditBalance;

    public double withdraw(double amount){
        System.out.println("Withdrawn: " + amount + "€.");
        return creditBalance -= amount;
    }

    public double getCreditBalance(){
        System.out.println("Current balance: " + creditBalance + "€.");
        return creditBalance;
    }
}
