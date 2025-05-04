package workshop10;

import javax.swing.*;
import java.awt.event.*;

public class success extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;

    public success() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public static void main(String[] args) {
        success dialog = new success();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
