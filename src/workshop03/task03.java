package workshop03;

class BankAccount {
    int accountNumber;
    float balance;
    String accountHolderName, accountHolderAddress;

    public BankAccount(int accountNumber, float balance, String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }
}

