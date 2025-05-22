package banking_app.SubClasses;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class WriteAccounts {
    private final String url;

    public WriteAccounts(String url) {
        this.url = url;  // set file path
    }

    // method to write account details from table to CSV file
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
