package banking_app.SubClasses;

public class Account extends Customer {
    private final int accountNumber;  // account number is unique and never changed
    private double accountBalance;

    public Account(String firstName, String lastName, int accountNumber, double accountBalance) {
        super(firstName, lastName);  // get firstName and lastName from Customer class
        this.accountNumber = accountNumber;  // set account number
        this.accountBalance = accountBalance;  // set account balance
    }

    public int getAccountNumber() {
        return accountNumber;  // get account number
    }

    public double getAccountBalance() {
        return accountBalance;  // get account balance
    }
    
    // method to deposit balance
    public boolean deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            return true;
        }
        return false;
    }
    
    // method to withdraw balance
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }
}
