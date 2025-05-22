package banking_app.SubClasses;

public class Account extends Customer {
    private final int accountNumber;
    private double accountBalance;

    public Account(String firstName, String lastName, int accountNumber, double accountBalance) {
        super(firstName, lastName);
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }
}
