package workshop10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class quest04 {
    private JTable table1;
    private JPanel panel1;

    public quest04() {
        String[] columns = {"FIRST_NAME", "LAST_NAME", "ADDRESS", "CONTACT_NUMBER", "SEMESTER"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        try (BufferedReader br = new BufferedReader(new FileReader("src/workshop10/sample.csv"))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(",");
                model.addRow(rowData);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        table1.setModel(model);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("quest04");
        frame.setContentPane(new quest04().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
