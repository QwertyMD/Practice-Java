package workshop10;

import javax.swing.*;

public class quest01 {
    private JPanel panel;
    private JButton loginButton;
    private JTextField textField1;
    private JTextField textField2;

    public quest01() {
        loginButton.addActionListener(e -> {
            String username = textField1.getText();
            String password = textField2.getText();
            if (username.equals("admin") && password.equals("password")) {
                success dialog = new success();
                dialog.pack();
                dialog.setVisible(true);
            } else {
                invalid dialog = new invalid();
                dialog.pack();
                dialog.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new quest01().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
