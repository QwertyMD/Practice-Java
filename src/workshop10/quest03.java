package workshop10;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class quest03 {
    private JButton addToCSVButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPanel panel;

    public quest03() {
        addToCSVButton.addActionListener(e -> {
            String name = textField1.getText();
            String age = textField2.getText();
            String email = textField3.getText();
            String phone = textField4.getText();
            String address = textField5.getText();
            String csvLine = name + "," + age + "," + email + "," + phone + "," + address;
            try (
                    BufferedWriter writer = new BufferedWriter(new FileWriter("src/workshop10/contacts.csv", true))
            ) {
                writer.write(csvLine);
                writer.newLine();
                writer.flush();

            } catch (IOException err) {
                System.out.println(err.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Add to CSV");
        frame.setContentPane(new quest03().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
