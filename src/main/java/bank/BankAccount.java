package bank;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }


    public double deposit(double amount) {
        return balance += amount;
    }

    public double withDraw(double amount) {
        return balance -= amount;
    }

    public void display() {
        System.out.println("balance: " + balance);
    }
}
