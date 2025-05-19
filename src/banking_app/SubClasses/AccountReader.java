package banking_app.SubClasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class AccountReader {
    public LinkedList<String> firstNames = new LinkedList<>();
    public LinkedList<String> lastNames = new LinkedList<>();
    public LinkedList<Integer> accountNumbers = new LinkedList<>();
    public LinkedList<Double> accountBalances = new LinkedList<>();

    public LinkedList<String> getFirstNames() {
        return firstNames;
    }

    public LinkedList<String> getLastNames() {
        return lastNames;
    }

    public LinkedList<Integer> getAccountNumbers() {
        return accountNumbers;
    }

    public LinkedList<Double> getAccountBalances() {
        return accountBalances;
    }

    public AccountReader(String url, int index) {
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
}
