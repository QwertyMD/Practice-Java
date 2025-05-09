package banking_app;

import javax.swing.*;
import java.util.LinkedList;

public class GUI {
    JPanel panel;
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

    public GUI(LinkedList<Account> accounts) {
        showAllButton.addActionListener(e -> {
            StringBuilder sb = new StringBuilder();
            for (Account account : accounts) {
                sb
                        .append("=========================\n")
                        .append("Account: ").append(account.getAccountNumber()).append("\n")
                        .append("Name: ").append(account.getFirstName()).append(" ").append(account.getLastName()).append("\n")
                        .append("Balance: ").append(account.getAccountBalance()).append("\n")
                        .append("=========================\n");
            }
            messageBox.setText(sb.toString());
        });

        depositButton.addActionListener(e -> {
            int accountNumber = Integer.parseInt(accountNumberDeposit.getText());
            int amount = Integer.parseInt(depositAmount.getText());
            for (Account account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    account.deposit(amount);
                    messageBox.setText("Deposited " + amount + " to account " + accountNumber);
                    return;
                }
            }
            messageBox.setText("Account not found.");
        });

        withdrawButton.addActionListener(e -> {
            int accountNumber = Integer.parseInt(accountNumberWithdraw.getText());
            int amount = Integer.parseInt(withdrawAmount.getText());
            for (Account account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    if (account.withdraw(amount)) {
                        messageBox.setText("Withdrew " + amount + " from account " + accountNumber);
                    } else {
                        messageBox.setText("Withdrawal failed.");
                    }
                    return;
                }
            }
            messageBox.setText("Account not found.");
        });
    }
}