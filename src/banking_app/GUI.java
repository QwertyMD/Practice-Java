package banking_app;

import javax.swing.*;
import java.util.LinkedList;

public class GUI {
    private JPanel panel1;
    private JButton showAllButton;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton transferButton;
    private JTextField accountNumberDeposit;
    private JTextPane messageBox;
    private JTextField accountNumberWithdraw;
    private JTextField accountNumberFrom;
    private JTextField accountNumberTo;
    private JTextField depositAmount;
    private JTextField withdrawAmount;
    private JTextField transferAmount;

    public GUI() {
        showAllButton.addActionListener(e -> {
            ReadAccounts readAccounts = new ReadAccounts("src/banking_app/Accounts.csv");
            LinkedList<String> firstNames = readAccounts.getFirstNames();
            LinkedList<String> lastNames = readAccounts.getLastNames();
            LinkedList<String> accountNumbers = readAccounts.getAccountNumbers();
            LinkedList<String> accountBalances = readAccounts.getAccountBalances();

            StringBuilder message = new StringBuilder();
            for (int i = 0; i < firstNames.size(); i++) {
                message
                        .append("=========================\n")
                        .append("Account Number: ").append(accountNumbers.get(i)).append("\n")
                        .append("Name: ").append(firstNames.get(i)).append(" ").append(lastNames.get(i)).append("\n")
                        .append("Balance: ").append(accountBalances.get(i)).append("\n")
                        .append("=========================\n");
            }
            messageBox.setText(message.toString());
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Banking App");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}