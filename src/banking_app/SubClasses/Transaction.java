package banking_app.SubClasses;

public class Transaction {
    // method to transfer balance from one account to another account
    public boolean transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            return true;
        }
        return false;
    }
}
