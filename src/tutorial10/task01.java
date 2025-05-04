package tutorial10;

import javax.swing.*;

public class task01 {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton convertButton;

    public task01() {
        convertButton.addActionListener(e -> {
            String celsiusText = textField1.getText();
            double celsiusValue = Double.parseDouble(celsiusText);
            double fahrenheitValue = (celsiusValue * 9 / 5) + 32;
            textField2.setText(String.valueOf(fahrenheitValue));
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Celsius to Fahrenheit Converter");
        frame.setContentPane(new task01().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
