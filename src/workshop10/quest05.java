package workshop10;

import javax.swing.*;
import java.awt.*;

public class quest05 {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public static void main(String[] args) {
        new quest05().createGUI();
    }

    private void createGUI() {
        JFrame frame = new JFrame("Card Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel card1 = new JPanel();
        card1.setBackground(Color.RED);
        JButton button1 = new JButton("Go to Card 2");
        card1.add(new JLabel("Card 1"));
        card1.add(button1);

        JPanel card2 = new JPanel();
        card2.setBackground(Color.GREEN);
        JButton button2 = new JButton("Go to Card 3");
        card2.add(new JLabel("Card 2"));
        card2.add(button2);

        JPanel card3 = new JPanel();
        card3.setBackground(Color.BLUE);
        JButton button3 = new JButton("Go to Card 1");
        card3.add(new JLabel("Card 3"));
        card3.add(button3);

        mainPanel.add(card1, "Card1");
        mainPanel.add(card2, "Card2");
        mainPanel.add(card3, "Card3");

        button1.addActionListener(e -> cardLayout.show(mainPanel, "Card2"));
        button2.addActionListener(e -> cardLayout.show(mainPanel, "Card3"));
        button3.addActionListener(e -> cardLayout.show(mainPanel, "Card1"));

        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}