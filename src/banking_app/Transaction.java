package banking_app;

public class Transaction {
    public void transfer(Account fromAccount, Account toAccount, int amount) {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
        }
    }
}