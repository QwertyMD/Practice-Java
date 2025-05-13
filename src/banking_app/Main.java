package banking_app;

import javax.swing.*;
import java.util.LinkedList;

public class Main {
    public static LinkedList<Account> accounts;
    public static LinkedList<String> firstNames;
    public static LinkedList<String> lastNames;
    public static LinkedList<Integer> accountNumbers;
    public static LinkedList<Double> accountBalances;
    public static String file;
    public static ReadAccounts readAccounts;
    public static GUI gui;

    public static void main(String[] args) {
        accounts = new LinkedList<>();
        file = "src/banking_app/Accounts.csv";
        readAccounts = new ReadAccounts(file);
        firstNames = readAccounts.getFirstNames();
        lastNames = readAccounts.getLastNames();
        accountNumbers = readAccounts.getAccountNumbers();
        accountBalances = readAccounts.getAccountBalances();

        for (int i = 0; i < firstNames.size(); i++) {
            accounts.add(new Account(firstNames.get(i), lastNames.get(i), accountNumbers.get(i), accountBalances.get(i)));
        }

        gui = new GUI(accounts);
        JFrame frame = new JFrame("Banking App");
        frame.setContentPane(gui.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}