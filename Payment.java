import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Payment extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel paymentLabel, nameLabel, phoneLabel, orderSummaryLabel;
    private JLabel orderNameLabel, balanceLabel, vatLabel, totalLabel;
    private JLabel payLabel, bkashLabel, nagadLabel, rocketLabel;
    private JTextField nameField, phoneField;
    private JRadioButton bkashRadio, nagadRadio, rocketRadio;
    private ButtonGroup paymentGroup;
    private JButton confirmButton, paymentBackButton;
    private Font paymentTitleFont, phoneLabelFont, orderSummaryLabelFont, orderNameLabelFont, balanceLabelFont,
            vatLabelFont,
            totalLabelFont;
    private ImageIcon pay, pay2, bkash, bkash2, nagad, nagad2, rocket, rocket2;
    private String name;
    private double price;
    private FileWriter fileWriter;

    public Payment(String s, Double p) {
        super("Payment");
        this.setSize(1000, 720);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        name = s;
        price = p;

        panel = new JPanel();
        panel.setLayout(null);

        // Payment Section

        pay = new ImageIcon("./img/payy.png");
        Image pay1 = pay.getImage().getScaledInstance(455, 650, Image.SCALE_SMOOTH);
        pay2 = new ImageIcon(pay1);
        payLabel = new JLabel(pay2);
        payLabel.setBounds(40, 60, 450, 600);
        panel.add(payLabel);

        paymentLabel = new JLabel("We accept only:");
        paymentLabel.setBounds(580, 80, 250, 30);
        paymentTitleFont = new Font("Cambria", Font.BOLD, 25);
        paymentLabel.setFont(paymentTitleFont);
        panel.add(paymentLabel);

        // Payment Options (Radio Buttons)

        bkash = new ImageIcon("./img/bk.png");
        Image bkash1 = bkash.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        bkash2 = new ImageIcon(bkash1);
        bkashLabel = new JLabel(bkash2);
        bkashLabel.setBounds(580, 140, 80, 80);
        panel.add(bkashLabel);

        bkashRadio = new JRadioButton("Bkash");
        bkashRadio.setBounds(580, 230, 100, 30);
        panel.add(bkashRadio);

        nagad = new ImageIcon("./img/ng.png");
        Image nagad1 = nagad.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        nagad2 = new ImageIcon(nagad1);
        nagadLabel = new JLabel(nagad2);
        nagadLabel.setBounds(680, 140, 80, 80);
        panel.add(nagadLabel);

        nagadRadio = new JRadioButton("Nagad");
        nagadRadio.setBounds(680, 230, 100, 30);
        panel.add(nagadRadio);

        rocket = new ImageIcon("./img/rc.png");
        Image rocket1 = rocket.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        rocket2 = new ImageIcon(rocket1);
        rocketLabel = new JLabel(rocket2);
        rocketLabel.setBounds(780, 140, 90, 90);
        panel.add(rocketLabel);

        rocketRadio = new JRadioButton("Rocket");
        rocketRadio.setBounds(780, 230, 100, 30);
        panel.add(rocketRadio);

        // Ensure Only One Selection
        paymentGroup = new ButtonGroup();
        paymentGroup.add(bkashRadio);
        paymentGroup.add(nagadRadio);
        paymentGroup.add(rocketRadio);

        // Name Label & Input Field
        nameLabel = new JLabel("Enter Your Name:");
        nameLabel.setBounds(580, 275, 200, 30);
        phoneLabelFont = new Font("Cambria", Font.BOLD, 15);
        nameLabel.setFont(phoneLabelFont);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(580, 310, 200, 30);
        panel.add(nameField);

        // **Phone Label & Input Field**
        phoneLabel = new JLabel("Enter Phone Number:");
        phoneLabel.setBounds(580, 340, 200, 30);
        phoneLabelFont = new Font("Cambria", Font.BOLD, 15);
        phoneLabel.setFont(phoneLabelFont);
        panel.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(580, 375, 200, 30);
        panel.add(phoneField);

        // Order Summary
        orderSummaryLabel = new JLabel("Order Summary");
        orderSummaryLabel.setBounds(580, 420, 250, 30);
        orderSummaryLabelFont = new Font("Cambria", Font.BOLD, 25);
        orderSummaryLabel.setFont(orderSummaryLabelFont);
        panel.add(orderSummaryLabel);

        orderNameLabel = new JLabel("Order Name: ");
        orderNameLabel.setBounds(580, 460, 250, 30);
        orderNameLabelFont = new Font("Cambria", Font.BOLD, 15);
        orderNameLabel.setFont(orderNameLabelFont);
        panel.add(orderNameLabel);

        balanceLabel = new JLabel("Balance Amount: BDT " + price);
        balanceLabel.setBounds(580, 490, 250, 30);
        balanceLabelFont = new Font("Cambria", Font.BOLD, 15);
        balanceLabel.setFont(balanceLabelFont);
        panel.add(balanceLabel);

        vatLabel = new JLabel("VAT(15%): BDT " + (p * 0.15));
        vatLabel.setBounds(580, 520, 250, 30);
        vatLabelFont = new Font("Cambria", Font.BOLD, 15);
        vatLabel.setFont(vatLabelFont);
        panel.add(vatLabel);

        totalLabel = new JLabel("Total: BDT " + (p + (p * 0.15)));
        totalLabel.setBounds(580, 550, 250, 30);
        totalLabelFont = new Font("Cambria", Font.BOLD, 15);
        totalLabel.setFont(totalLabelFont);
        panel.add(totalLabel);

        // **Confirm Button**
        confirmButton = new JButton("Confirm Your Order");
        confirmButton.setBounds(580, 600, 180, 28);
        confirmButton.setBackground(Color.RED);
        confirmButton.setForeground(Color.WHITE);
        confirmButton.addActionListener(this);
        panel.add(confirmButton);

        // Payment Cancel Button
        paymentBackButton = new JButton("Cancel");
        paymentBackButton.setBounds(780, 600, 80, 28);
        paymentBackButton.setBackground(Color.WHITE);
        paymentBackButton.setForeground(Color.BLACK);
        paymentBackButton.addActionListener(this);
        panel.add(paymentBackButton);

        super.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        String s1, s2, payM = "";
        s1 = nameField.getText();
        s2 = phoneField.getText();
        if (ae.getSource() == paymentBackButton) {
            DashBoard obj1 = new DashBoard();
            obj1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == confirmButton) {
            if (!bkashRadio.isSelected() && !nagadRadio.isSelected() && !rocketRadio.isSelected() || s1.isEmpty()
                    || s2.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fill up all information!!");
            } else {
                this.setVisible(false);
                JOptionPane.showMessageDialog(this,
                        name + " Payment Successful!!\n" + "Name: " + s1 + "\nPhone Num: " + s2 + "\nTotal: BDT"
                                + (price + (price * 0.15)));
                // Add Payment Info to File
                try {
                    if (bkashRadio.isSelected()) {
                        payM = "Bkash";
                    } else if (nagadRadio.isSelected()) {
                        payM = "Nagad";
                    } else if (rocketRadio.isSelected()) {
                        payM = "Rocket";
                    }
                    File file = new File("./files/payment.txt");
                    file.createNewFile();
                    fileWriter = new FileWriter(file, true);
                    fileWriter.write(
                            name + "\t" + s1 + "\t" + s2 + "\t\t" + (price + (price * 0.15)) + "\t" + payM + "\n");
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException ie) {
                    ie.printStackTrace();
                }
                DashBoard obj1 = new DashBoard();
                obj1.setVisible(true);
            }
        }
    }
}
