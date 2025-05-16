package banking_app;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
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
    private JButton writeToCSVButton;
    private JTable accountTable;
    private JScrollPane scrollPaneTable;

    public GUI(LinkedList<Account> accounts) {
        Border roundedBorder = BorderFactory.createLineBorder(new Color(255, 87, 34), 3, true);
        Border paddingBorder = BorderFactory.createEmptyBorder(3, 5, 3, 5);
        Border compoundBorder = BorderFactory.createCompoundBorder(roundedBorder, paddingBorder);

        showAllButton.setBorder(compoundBorder);
        depositButton.setBorder(compoundBorder);
        withdrawButton.setBorder(compoundBorder);
        transferButton.setBorder(compoundBorder);
        writeToCSVButton.setBorder(compoundBorder);

        accountNumberDeposit.setBorder(compoundBorder);
        accountNumberWithdraw.setBorder(compoundBorder);
        accountNumberFrom.setBorder(compoundBorder);
        accountNumberTo.setBorder(compoundBorder);
        depositAmount.setBorder(compoundBorder);
        withdrawAmount.setBorder(compoundBorder);
        transferAmount.setBorder(compoundBorder);
        messageBox.setBorder(compoundBorder);

        scrollPaneTable.setBorder(roundedBorder);

        showAllButton.addActionListener(e -> {
            String[] columnNames = {"Account ID", "First Name", "Last Name", "Balance"};
            Object[][] data = new Object[accounts.size()][4];
            for (int i = 0; i < accounts.size(); i++) {
                Account account = accounts.get(i);
                data[i][0] = account.getAccountNumber();
                data[i][1] = account.getFirstName();
                data[i][2] = account.getLastName();
                data[i][3] = account.getAccountBalance();
            }
            accountTable.setModel(new DefaultTableModel(data, columnNames));
            scrollPaneTable.setVisible(true);
            messageBox.setText("Updated the account table.");
        });

        depositButton.addActionListener(e -> {
            int accountNumber = Integer.parseInt(accountNumberDeposit.getText());
            double amount = Double.parseDouble(depositAmount.getText());
            accountNumberDeposit.setText("");
            depositAmount.setText("");
            for (Account account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    if (account.deposit(amount)) {
                        messageBox.setText("Deposited Rs." + amount + " to Account ID: " + accountNumber);
                    } else {
                        messageBox.setText("Invalid amount.");
                    }
                    return;
                }
            }
            messageBox.setText("Account not found.");
        });

        withdrawButton.addActionListener(e -> {
            int accountNumber = Integer.parseInt(accountNumberWithdraw.getText());
            double amount = Double.parseDouble(withdrawAmount.getText());
            accountNumberWithdraw.setText("");
            withdrawAmount.setText("");
            for (Account account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    if (account.withdraw(amount)) {
                        messageBox.setText("Withdrew Rs." + amount + " from Account ID: " + accountNumber);
                    } else {
                        messageBox.setText("Invalid amount or insufficient balance.");
                    }
                    return;
                }
            }
            messageBox.setText("Account not found.");
        });

        transferButton.addActionListener(e -> {
            int fromAccountNumber = Integer.parseInt(accountNumberFrom.getText());
            int toAccountNumber = Integer.parseInt(accountNumberTo.getText());
            double amount = Double.parseDouble(transferAmount.getText());
            accountNumberFrom.setText("");
            accountNumberTo.setText("");
            transferAmount.setText("");
            Account fromAccount = null;
            Account toAccount = null;
            for (Account account : accounts) {
                if (account.getAccountNumber() == fromAccountNumber) {
                    fromAccount = account;
                }
                if (account.getAccountNumber() == toAccountNumber) {
                    toAccount = account;
                }
            }
            if (fromAccount == null) {
                messageBox.setText("From account not found.");
                return;
            }
            if (toAccount == null) {
                messageBox.setText("To account not found.");
                return;
            }
            if (fromAccount.getAccountNumber() == toAccount.getAccountNumber()) {
                messageBox.setText("Cannot transfer to same account.");
                return;
            }
            Transaction transaction = new Transaction();
            if (transaction.transfer(fromAccount, toAccount, amount)) {
                messageBox.setText("Transferred Rs." + amount + " from Account ID: " + fromAccountNumber + " to Account ID: " + toAccountNumber);
            } else {
                messageBox.setText("Invalid amount or insufficient balance.");
            }
        });

        writeToCSVButton.addActionListener(e -> {
            WriteAccounts writeAccounts = new WriteAccounts("src/banking_app/Accounts.csv");
            writeAccounts.writeToCSV(accounts);
            messageBox.setText("Accounts written to CSV file.");
        });
    }
}