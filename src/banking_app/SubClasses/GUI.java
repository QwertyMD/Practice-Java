package banking_app.SubClasses;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class GUI {
    public JPanel panel;
    private JButton showAllButton;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton transferButton;
    private JTextField accountNumber;
    private JTextField amount;
    private JTextPane messageBox;
    private JTextField accountNumberFrom;
    private JTextField accountNumberTo;
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
        accountNumber.setBorder(compoundBorder);
        amount.setBorder(compoundBorder);
        accountNumberFrom.setBorder(compoundBorder);
        accountNumberTo.setBorder(compoundBorder);
        transferAmount.setBorder(compoundBorder);
        messageBox.setBorder(compoundBorder);
        scrollPaneTable.setBorder(roundedBorder);

        showAllButton.addActionListener(new HandlerClass("showAll", accounts));
        depositButton.addActionListener(new HandlerClass("deposit", accounts));
        withdrawButton.addActionListener(new HandlerClass("withdraw", accounts));
        transferButton.addActionListener(new HandlerClass("transfer", accounts));
        writeToCSVButton.addActionListener(new HandlerClass("writeToCSV", accounts));
    }

    private class HandlerClass implements ActionListener {
        private final String action;
        private final LinkedList<Account> accounts;

        public HandlerClass(String action, LinkedList<Account> accounts) {
            this.action = action;
            this.accounts = accounts;
        }

        ErrorHandler error = new ErrorHandler();

        public void handleFetch() {
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
        }

        public void handleShowAll() {
            handleFetch();
        }

        public void handleDepositWithdraw(String action) {
            String accNum = accountNumber.getText().trim();
            String amt = amount.getText().trim();

            error.errorHandler(accNum, amt);

            int accountNumber = Integer.parseInt(accNum);
            double amount = Double.parseDouble(amt);

            clearFields();

            for (Account account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    if (action.equals("deposit")) {
                        if (account.deposit(amount)) {
                            JOptionPane.showMessageDialog(null, "Deposited Rs." + amount + " to Account ID: " + accountNumber);
                        }
                    } else if (action.equals("withdraw")) {
                        if (account.withdraw(amount)) {
                            JOptionPane.showMessageDialog(null, "Withdrew Rs." + amount + " from Account ID: " + accountNumber);
                        }
                    }
                    handleFetch();
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Account ID: " + accountNumber + " not found.");
        }

        public void handleDeposit() {
            handleDepositWithdraw("deposit");
        }

        public void handleWithdraw() {
            handleDepositWithdraw("withdraw");
        }

        public void handleTransfer() {
            String fromAccNum = accountNumberFrom.getText().trim();
            String toAccNum = accountNumberTo.getText().trim();
            String amt = transferAmount.getText().trim();

            error.errorHandler(fromAccNum, toAccNum, amt);

            int fromAccountNumber = Integer.parseInt(fromAccNum);
            int toAccountNumber = Integer.parseInt(toAccNum);
            double amount = Double.parseDouble(amt);

            clearFields();

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

            error.errorHandler(fromAccount, toAccount, fromAccountNumber, toAccountNumber);

            Transaction transaction = new Transaction();
            if (transaction.transfer(fromAccount, toAccount, amount)) {
                JOptionPane.showMessageDialog(null, "Transferred Rs." + amount + " from Account ID: " + fromAccountNumber + " to Account ID: " + toAccountNumber);
                handleFetch();
            }
        }

        public void handleWriteToCSV() {
            WriteAccounts writeAccounts = new WriteAccounts("src/banking_app/CSV/Accounts.csv");
            writeAccounts.writeToCSV(accounts);
            messageBox.setText("Accounts written to CSV file.");
        }

        public void clearFields() {
            accountNumber.setText("");
            accountNumberFrom.setText("");
            accountNumberTo.setText("");
            amount.setText("");
            transferAmount.setText("");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (action) {
                case "showAll" -> handleShowAll();
                case "deposit" -> handleDeposit();
                case "withdraw" -> handleWithdraw();
                case "transfer" -> handleTransfer();
                case "writeToCSV" -> handleWriteToCSV();
            }
        }
    }
}