package banking_app.SubClasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ReadAccounts {
    public LinkedList<String> firstNames = new LinkedList<>();
    public LinkedList<String> lastNames = new LinkedList<>();
    public LinkedList<Integer> accountNumbers = new LinkedList<>();
    public LinkedList<Double> accountBalances = new LinkedList<>();
    private final String url;

    public ReadAccounts(String url) {
        this.url = url;  // set file path
    }

    // method to read accounts from CSV file
    public void readAccounts(String url, int index) {
        try (BufferedReader reader = new BufferedReader(new FileReader(url))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                switch (index) {
                    case 0 -> firstNames.add(data[0]);
                    case 1 -> lastNames.add(data[1]);
                    case 2 -> accountNumbers.add(Integer.valueOf(data[2]));
                    case 3 -> accountBalances.add(Double.valueOf(data[3]));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    // method to get first names and add to list of first names
    public LinkedList<String> getFirstNames() {
        readAccounts(url, 0);
        return firstNames;
    }

    // method to get last names and add to list of last names
    public LinkedList<String> getLastNames() {
        readAccounts(url, 1);
        return lastNames;
    }

    // method to get account numbers and add to list of account numbers
    public LinkedList<Integer> getAccountNumbers() {
        readAccounts(url, 2);
        return accountNumbers;
    }

    // method to get account balances and add to list of account balances
    public LinkedList<Double> getAccountBalances() {
        readAccounts(url, 3);
        return accountBalances;
    }
}
