package banking_app.SubClasses;

import java.util.LinkedList;

public class ReadAccounts {
    private String url;

    public ReadAccounts(String url) {
        this.url = url;
    }

    public LinkedList<String> getFirstNames() {
        AccountReader reader = new AccountReader(url, 0);
        return reader.getFirstNames();
    }

    public LinkedList<String> getLastNames() {
        AccountReader reader = new AccountReader(url, 1);
        return reader.getLastNames();
    }

    public LinkedList<Integer> getAccountNumbers() {
        AccountReader reader = new AccountReader(url, 2);
        return reader.getAccountNumbers();
    }

    public LinkedList<Double> getAccountBalances() {
        AccountReader reader = new AccountReader(url, 3);
        return reader.getAccountBalances();
    }
}
