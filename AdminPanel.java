import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class AdminPanel extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton exitBtn, backBtn, refreshBtn;
    private JTextArea userArea, paymentArea;

    public AdminPanel() {
        super("AdminPanel");
        super.setSize(1000, 720);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        backBtn = new JButton("Back");
        backBtn.setBounds(250, 620, 120, 40);
        backBtn.setBackground(Color.RED);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(this);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(550, 620, 120, 40);
        exitBtn.setBackground(Color.RED);
        exitBtn.setForeground(Color.WHITE);
        exitBtn.addActionListener(this);

        refreshBtn = new JButton("Refresh Users");
        refreshBtn.setBounds(400, 620, 120, 40);
        refreshBtn.setBackground(Color.WHITE);
        refreshBtn.setForeground(Color.BLACK);
        refreshBtn.addActionListener(this);

        userArea = new JTextArea();
        userArea.setBounds(25, 20, 380, 580);
        userArea.setEditable(false);

        paymentArea = new JTextArea();
        paymentArea.setBounds(455, 20, 500, 580);
        paymentArea.setEditable(false);

        panel.add(backBtn);
        panel.add(exitBtn);
        panel.add(refreshBtn);
        panel.add(userArea);
        panel.add(paymentArea);

        loadUserData();
        loadPaymentData();

        super.add(panel);
    }

    private void loadUserData() {
        try {
            File file = new File("./files/info.txt");
            if (!file.exists()) {
                userArea.setText("User data file not found!");
                return;
            }

            userArea.setText("User Information:\n");
            userArea.append("\nUsername\tPhone\t   Email\t\tPassword\n");
            userArea.append(
                    "------------------------------------------------------------------------------------------------------\n");

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                userArea.append(line + "\n");
            }
            sc.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public void loadPaymentData() {
        try {
            File file = new File("./files/payment.txt");
            if (!file.exists()) {
                paymentArea.setText("Payment data file not found!");
                return;
            }

            paymentArea.setText("Payment Information:\n");
            paymentArea.append("\nPayment\tName\tPhone No\t\tAmount\tPayment Method\n");
            paymentArea.append(
                    "------------------------------------------------------------------------------------------------------------------------------------------------------\n");

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                paymentArea.append(line + "\n");
            }
            sc.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exitBtn) {
            System.exit(0);
        } else if (ae.getSource() == backBtn) {
            Welcome o = new Welcome();
            o.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == refreshBtn) {
            loadUserData();
            loadPaymentData();
        }
    }
}