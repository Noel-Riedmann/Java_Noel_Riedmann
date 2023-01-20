package at.noel.cc.accounts;

public class CheckingsAccount extends BaseAccount{
    private double limit;

    public CheckingsAccount(double limit) {
        this.limit = limit;
    }

    public double withdraw(double amount){
        if ((getBalance() - amount) >= limit){
            System.out.println("Withdrawn " + amount + "€.");
            return super.withdraw(amount);
        }
        else {
            System.out.println("Not enough money available!");
            return 0;
        }
    }
}
