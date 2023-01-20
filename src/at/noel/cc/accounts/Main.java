package at.noel.cc.accounts;

public class Main {
    public static void main(String[] args) {
        CheckingsAccount giroAcc = new CheckingsAccount(-100.00);
        CreditAccount creditAcc = new CreditAccount();
        SavingsAccount saveAcc = new SavingsAccount();

        giroAcc.deposit(10000.94);
        giroAcc.getBalance();
        giroAcc.withdraw(500.93);
        giroAcc.getBalance();

        creditAcc.withdraw(99.99);
        creditAcc.getCreditBalance();

        saveAcc.deposit(50.00);
        saveAcc.getBalance();
        saveAcc.withdraw(60.00);
        saveAcc.getBalance();
    }
}
