package workshop03;

public class task07 {
    BankAccount account;

    public static void main(String[] args) {
        task07 mainInstance = new task07();
        mainInstance.createObj();
        mainInstance.printDetails();
    }

    public void createObj() {
        account = new BankAccount(123456789, 1000.0f, "Ravi Kumar", "USA");
    }

    public void printDetails() {
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Account Balance: " + account.balance);
        System.out.println("Account Holder Name: " + account.accountHolderName);
        System.out.println("Account Holder Address: " + account.accountHolderAddress);
    }
}
