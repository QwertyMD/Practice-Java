package banking_app;

public class Account extends Customer {
    private final int accountNumber;
    private int accountBalance;

    public Account(String firstName, String lastName, int accountNumber, int accountBalance) {
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

    public boolean deposit(int amount) {
        if (amount > 0) {
            accountBalance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }
}
