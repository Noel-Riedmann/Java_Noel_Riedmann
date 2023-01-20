package at.noel.cc.accounts;

public class BaseAccount {
    private double balance;

    public double deposit(double amount){
        System.out.println("Deposited " + amount + "€.");
        return balance += amount;
    }

    public double withdraw(double amount){
        System.out.println("Withdrawn " + amount + "€.");
        return balance -= amount;
    }

    public double getBalance(){
        System.out.println("Current balance: " + balance + "€.");
        return balance;
    }
}
