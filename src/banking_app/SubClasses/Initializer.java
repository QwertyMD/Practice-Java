package banking_app.SubClasses;

import javax.swing.*;
import java.util.LinkedList;

public class Initializer {
    public LinkedList<Account> accounts;
    public LinkedList<String> firstNames;
    public LinkedList<String> lastNames;
    public LinkedList<Integer> accountNumbers;
    public LinkedList<Double> accountBalances;
    public String file;
    public ReadAccounts readAccounts;
    public GUI gui;

    public void init() {
        accounts = new LinkedList<>();
        file = "src/banking_app/CSV/Accounts.csv";
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
