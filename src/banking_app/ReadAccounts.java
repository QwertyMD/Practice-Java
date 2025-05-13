package banking_app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ReadAccounts {
    private BufferedReader reader;
    private String url;

    public ReadAccounts(String url) {
        this.url = url;
    }

    public LinkedList<String> getFirstNames() {
        LinkedList<String> firstNames = new LinkedList<>();
        try {
            reader = new BufferedReader(new FileReader(url));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String firstName = data[0];
                firstNames.add(firstName);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return firstNames;
    }

    public LinkedList<String> getLastNames() {
        LinkedList<String> lastNames = new LinkedList<>();
        try {
            reader = new BufferedReader(new FileReader(url));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String lastName = data[1];
                lastNames.add(lastName);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lastNames;
    }

    public LinkedList<Integer> getAccountNumbers() {
        LinkedList<Integer> accountNumbers = new LinkedList<>();
        try {
            reader = new BufferedReader(new FileReader(url));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String accountNumber = data[2];
                accountNumbers.add(Integer.valueOf(accountNumber));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return accountNumbers;
    }

    public LinkedList<Double> getAccountBalances() {
        LinkedList<Double> accountBalances = new LinkedList<>();
        try {
            reader = new BufferedReader(new FileReader(url));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String accountBalance = data[3];
                accountBalances.add(Double.valueOf(accountBalance));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return accountBalances;
    }
}
