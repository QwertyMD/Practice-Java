package banking_app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAccounts {
    String filePath;

    public ReadAccounts(String filePath) {
        this.filePath = filePath;
    }

    public void readAccountsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String firstName = data[0];
                String lastName = data[1];
                int accountNumber = Integer.parseInt(data[2]);
                double accountBalance = Double.parseDouble(data[3]);

                Account account = new Account(firstName, lastName, accountNumber, accountBalance);
                System.out.println("Account created: " + account.getAccountNumber() + ", " + firstName + lastName + ", " + account.getAccountBalance());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
