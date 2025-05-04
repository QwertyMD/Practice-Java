package workshop10;

import javax.swing.*;
import java.awt.event.*;

public class invalid extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;

    public invalid() {
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
        invalid dialog = new invalid();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
