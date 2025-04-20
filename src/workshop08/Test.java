package workshop08;

class Customer {
    String firstName;
    String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Account extends Customer {
    String accountNumber;
    double balance;

    public Account(String firstName, String lastName, String accountNumber, double balance) {
        super(firstName, lastName);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
            return false;
        }
    }
}

class Transaction {
    public void transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from " + fromAccount.getAccountNumber() + " to " + toAccount.getAccountNumber());
        } else {
            System.out.println("Transfer failed.");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Account account1 = new Account("Harold", "Denver", "123", 1000.0);
        Account account2 = new Account("Syndy", "Emilson", "456", 500.0);

        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());

        Transaction transaction = new Transaction();
        transaction.transfer(account1, account2, 200.0);

        System.out.println("Account 1 Balance after transfer: " + account1.getBalance());
        System.out.println("Account 2 Balance after transfer: " + account2.getBalance());
    }
}
