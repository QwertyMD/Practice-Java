package banking_app;

public class Account extends Customer {
    private int accountNumber;
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

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount.");
        } else {
            accountBalance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount.");
            return false;
        } else if (amount > accountBalance) {
            System.out.println("Insufficient amount.");
            return false;
        } else {
            accountBalance -= amount;
            return true;
        }
    }
}
