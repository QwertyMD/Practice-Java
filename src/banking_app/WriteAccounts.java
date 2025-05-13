package banking_app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class WriteAccounts {
    private String url;

    public WriteAccounts(String url) {
        this.url = url;
    }

    public void writeToCSV(LinkedList<Account> accounts) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(url))) {
            for (Account account : accounts) {
                writer.write(account.getFirstName() + "," + account.getLastName() + "," + account.getAccountNumber() + "," + account.getAccountBalance());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
