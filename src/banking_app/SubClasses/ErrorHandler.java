package banking_app.SubClasses;

import javax.swing.*;

public class ErrorHandler {
    public void errorHandler(String accNum, String amt) {
        if (accNum.isEmpty() && amt.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Account and Amount Fields are Empty");
        } else if (accNum.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Account Field is Empty");
        } else if (amt.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Amount Field is Empty");
        } else if (Integer.parseInt(accNum) < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Account Number");
        } else if (Integer.parseInt(amt) < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Amount or Insufficient Balance");
        }
    }

    public void errorHandler(String fromAccountNumber, String toAccountNumber, String amount) {
        if (fromAccountNumber.isEmpty() && toAccountNumber.isEmpty() && amount.isEmpty()) {
            JOptionPane.showMessageDialog(null, "From Account, To Account and Amount Fields are Empty");
        } else if (fromAccountNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "From Account Field is Empty");
        } else if (toAccountNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "To Account Field is Empty");
        } else if (amount.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Amount Field is Empty");
        } else if (Integer.parseInt(fromAccountNumber) < 0 || Integer.parseInt(toAccountNumber) < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Account Number");
        } else if (Integer.parseInt(amount) < 0) {
            JOptionPane.showMessageDialog(null, "Invalid Amount or Insufficient Balance");
        } else if (fromAccountNumber.equals(toAccountNumber)) {
            JOptionPane.showMessageDialog(null, "Cannot transfer to same account");
        }
    }

    public void errorHandler(Account fromAccount, Account toAccount, int fromAccountNumber, int toAccountNumber) {
        if (fromAccount == null && toAccount == null) {
            JOptionPane.showMessageDialog(null, "From Account ID: " + fromAccountNumber + " and To Account ID: " + toAccountNumber + " not found.");
        } else if (fromAccount == null) {
            JOptionPane.showMessageDialog(null, "From Account ID: " + fromAccountNumber + " not found.");
        } else if (toAccount == null) {
            JOptionPane.showMessageDialog(null, "To Account ID: " + toAccountNumber + " not found.");
        }
    }
}
