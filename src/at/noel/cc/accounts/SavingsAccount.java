package at.noel.cc.accounts;

public class SavingsAccount extends BaseAccount{
    public double withdraw(double amount){
        if ((getBalance() - amount) >= 0){
            System.out.println("Withdrawn " + amount + "€ from savings.");
            return getBalance();
        }
        else {
            System.out.println("Not enough money available!");
            return 0;
        }
    }
}
