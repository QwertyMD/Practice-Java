package banking_app;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteAccounts {
    BufferedWriter writer;
    String url;

    public WriteAccounts(String url) {
        this.url = url;
    }

    public void writeToCSV(Account account) {
        try {
            writer = new BufferedWriter(new FileWriter(url));
            String data = account.getFirstName() + "," + account.getLastName() + "," + account.getAccountNumber() + "," + account.getAccountBalance();
            writer.write(data);
            writer.newLine();
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
