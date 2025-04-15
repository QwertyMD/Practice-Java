package workshop03;

public class task13 {
    public static void main(String[] args) {
        task13 mainInstance = new task13();
        mainInstance.showData();
    }

    private static class BankAccount {
        int accountNumber;
        float balance;
        String accountHolderName, accountHolderAddress;

        public int getAccountNumber() {
            return accountNumber;
        }

        public float getBalance() {
            return balance;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public String getAccountHolderAddress() {
            return accountHolderAddress;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public void setBalance(float balance) {
            this.balance = balance;
        }

        public void setAccountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
        }

        public void setAccountHolderAddress(String accountHolderAddress) {
            this.accountHolderAddress = accountHolderAddress;
        }
    }

    public void showData() {
        BankAccount account = new BankAccount();
        account.setAccountNumber(123);
        account.setBalance(15000.45f);
        account.setAccountHolderName("Ravi Kumar");
        account.setAccountHolderAddress("USA");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Name: " + account.getAccountHolderName());
        System.out.println("Address: " + account.getAccountHolderAddress());
    }
}