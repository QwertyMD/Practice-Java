package workshop03;

class Customer {
    private int customerId;
    private BankAccount account;

    public Customer(int customerId, BankAccount account) {
        this.customerId = customerId;
        this.account = account;
    }

    public int getCustomerId() {
        return customerId;
    }

    public BankAccount getBankAccount() {
        return account;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setBankAccount(BankAccount account) {
        this.account = account;
    }
}

public class task12 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123, 5000.0f, "Ravi Kumar", "USA");
        Customer customer = new Customer(1, account);
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Bank Account Balance: " + customer.getBankAccount().balance);
    }
}
