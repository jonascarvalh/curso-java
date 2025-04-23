package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getnumber() {
        return number;
    }

    public String getholder() {
        return holder;
    }

    public void setholder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.00;
    }

    public String toString() {
        return "Account: " + this.number + ", Holder: " + this.holder + ", Balance: $ " + String.format("%.2f", this.balance);
    }
}
