package banking_app;

public class Main {
    public static void main(String[] args) {
        String file = "src/banking_app/Accounts.csv";
        ReadAccounts readAccounts = new ReadAccounts(file);
        readAccounts.readAccountsFromFile();
    }
}