package banking_app.SubClasses;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class GUI {
    // GUI components
    public JPanel panel;
    private JButton showHideButton;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton transferButton;
    private JTextField accountNumber;
    private JTextField amount;
    private JTextField accountNumberFrom;
    private JTextField accountNumberTo;
    private JTextField transferAmount;
    private JButton writeToCSVButton;
    private JTable accountTable;
    private JScrollPane scrollPaneTable;
    
    public GUI(LinkedList<Account> accounts) {
        // initialize borders
        Border roundedBorder = BorderFactory.createLineBorder(new Color(255, 87, 34), 3, true);
        Border paddingBorder = BorderFactory.createEmptyBorder(3, 5, 3, 5);
        Border compoundBorder = BorderFactory.createCompoundBorder(roundedBorder, paddingBorder);
        
        // set borders to GUI components
        showHideButton.setBorder(compoundBorder);
        depositButton.setBorder(compoundBorder);
        withdrawButton.setBorder(compoundBorder);
        transferButton.setBorder(compoundBorder);
        writeToCSVButton.setBorder(compoundBorder);
        accountNumber.setBorder(compoundBorder);
        amount.setBorder(compoundBorder);
        accountNumberFrom.setBorder(compoundBorder);
        accountNumberTo.setBorder(compoundBorder);
        transferAmount.setBorder(compoundBorder);
        scrollPaneTable.setBorder(roundedBorder);

        // setup action listeners and handlers for buttons
        showHideButton.addActionListener(new HandlerClass("showHide", accounts));
        depositButton.addActionListener(new HandlerClass("deposit", accounts));
        withdrawButton.addActionListener(new HandlerClass("withdraw", accounts));
        transferButton.addActionListener(new HandlerClass("transfer", accounts));
        writeToCSVButton.addActionListener(new HandlerClass("writeToCSV", accounts));
    }

    private class HandlerClass implements ActionListener {
        private final String action;  // action to be performed
        private final LinkedList<Account> accounts;  // list of accounts

        // constructor to initialize action and accounts
        public HandlerClass(String action, LinkedList<Account> accounts) {
            this.action = action;  // set action
            this.accounts = accounts;  // set accounts
        }

        ErrorHandler error = new ErrorHandler();  // create instance of ErrorHandler class

        // method to update the table with account details
        public void handleFetch() {
            String[] columnNames = {"Account ID", "First Name", "Last Name", "Balance"};
            Object[][] data = new Object[accounts.size()][4];  // create data array for table
            for (int i = 0; i < accounts.size(); i++) {
                Account account = accounts.get(i);
                data[i][0] = account.getAccountNumber();
                data[i][1] = account.getFirstName();
                data[i][2] = account.getLastName();
                data[i][3] = account.getAccountBalance();
            }
            accountTable.setModel(new DefaultTableModel(data, columnNames));  // set table model
            scrollPaneTable.setVisible(true);
            panel.revalidate();  // revalidate panel to update layout
            JOptionPane.showMessageDialog(null, "Accounts fetched successfully.");
        }

        // method to show or hide the table
        public void handleShowHide() {
            if (scrollPaneTable.isVisible()) {
                scrollPaneTable.setVisible(false);
                panel.revalidate();
            } else {
                handleFetch();  // update table when shown
            }
        }

        // method to handle deposit or withdraw actions
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
            handleDepositWithdraw("deposit");  // call method for deposit
        }

        public void handleWithdraw() {
            handleDepositWithdraw("withdraw");  // call method for withdraw
        }

        // method to handle transfer action
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

            Transaction transaction = new Transaction();  // create instance of Transaction class
            if (transaction.transfer(fromAccount, toAccount, amount)) {
                JOptionPane.showMessageDialog(null, "Transferred Rs." + amount + " from Account ID: " + fromAccountNumber + " to Account ID: " + toAccountNumber);
                handleFetch();
            }
        }

        // method to account details from table to CSV file
        public void handleWriteToCSV() {
            WriteAccounts writeAccounts = new WriteAccounts("src/banking_app/CSV/Accounts.csv");
            writeAccounts.writeToCSV(accounts);
            JOptionPane.showMessageDialog(null, "Accounts written to CSV file successfully.");
        }

        // method to clear input fields
        public void clearFields() {
            accountNumber.setText("");
            accountNumberFrom.setText("");
            accountNumberTo.setText("");
            amount.setText("");
            transferAmount.setText("");
        }

        @Override
        // method to handle button actions
        public void actionPerformed(ActionEvent e) {
            switch (action) {
                case "showHide" -> handleShowHide();
                case "deposit" -> handleDeposit();
                case "withdraw" -> handleWithdraw();
                case "transfer" -> handleTransfer();
                case "writeToCSV" -> handleWriteToCSV();
            }
        }
    }
}