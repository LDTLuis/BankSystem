package entities;

public class Account {

    private int numberAcc;
    private String holder;
    private double balance;

    public Account(int number, String holder, double firstDeposit) {
        this.numberAcc = number;
        this.holder = holder;
        deposit(firstDeposit);
    }

    public Account(int number, String holder) {
        this.numberAcc = number;
        this.holder = holder;
    }

    public int getNumber() {
        return numberAcc;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + numberAcc
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
}
