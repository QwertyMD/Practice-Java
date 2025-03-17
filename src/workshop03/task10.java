package workshop03;

public class task10 {
    public static void main(String[] args) {
        task10 mainInstance = new task10();
        mainInstance.showBalance();
    }

    private class BankAccount {
        private float balance;

        public float getBalance() {
            return balance;
        }

        public void setBalance(float balance) {
            this.balance = balance;
        }
    }

    public void showBalance() {
        BankAccount account = new BankAccount();
        account.setBalance(15000f);
        System.out.println("Balance: " + account.getBalance());
    }
}
