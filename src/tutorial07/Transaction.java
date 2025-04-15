package tutorial07;

import java.util.ArrayList;

public class Transaction {
    ArrayList<String> subServices = new ArrayList<>();

    public void process(Account account, double balance, String service) {
        if (account.balance >= balance) {
            account.balance -= balance;
            System.out.println(service + " purchased successfully.");
            System.out.println("Remaining balance: " + account.balance);
            subServices.add(service);
        } else {
            System.out.println("Insufficient Balance for " + service);
            System.out.println("Remaining balance: " + account.balance);
        }
    }
}