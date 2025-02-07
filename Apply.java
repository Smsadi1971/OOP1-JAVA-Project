import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Apply extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton nextBtn, backBtn, exitBtn;
    private JLabel applyLabel, searchTextLabel;
    private JLabel usaLabel, usaTextLabel, usaCostLabel;
    private JLabel ausLabel, ausTextLabel, ausCostLabel;
    private JLabel ukLabel, ukTextLabel, ukCostLabel;
    private JLabel cdLabel, cdTextLabel, cdCostLabel;
    private Font titleFont, searchFont;
    private JTextField nameField;
    private ImageIcon usa, usa2, aus, aus2, uk, uk2, cd, cd2;
    private Color exitBtnColor;

    public Apply() {
        super("Apply");
        super.setSize(1000, 720);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        exitBtnColor = Color.RED;

        // Apply Title
        applyLabel = new JLabel("Choose Your Country ");
        applyLabel.setBounds(300, 40, 650, 50);
        titleFont = new Font("Cambria", Font.BOLD, 40);
        applyLabel.setFont(titleFont);
        panel.add(applyLabel);

        // USA Image
        usa = new ImageIcon("./img/usf.png");
        Image usa1 = usa.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        usa2 = new ImageIcon(usa1);
        usaLabel = new JLabel(usa2);
        usaLabel.setBounds(20, 150, 200, 100);
        panel.add(usaLabel);

        usaTextLabel = new JLabel("USA");
        usaTextLabel.setBounds(100, 260, 100, 30);
        panel.add(usaTextLabel);

        usaCostLabel = new JLabel("Cost: 50,00,000 BDT");
        usaCostLabel.setBounds(60, 290, 200, 30);
        panel.add(usaCostLabel);

        // Australia Image
        aus = new ImageIcon("./img/ausf.png");
        Image aus1 = aus.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        aus2 = new ImageIcon(aus1);
        ausLabel = new JLabel(aus2);
        ausLabel.setBounds(270, 150, 200, 100);
        panel.add(ausLabel);

        ausTextLabel = new JLabel("AUS");
        ausTextLabel.setBounds(350, 260, 120, 40);
        panel.add(ausTextLabel);

        ausCostLabel = new JLabel("Cost: 35,00,000 BDT");
        ausCostLabel.setBounds(320, 290, 200, 30);
        panel.add(ausCostLabel);

        // UK Image
        uk = new ImageIcon("./img/ukf.png");
        Image uk1 = uk.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        uk2 = new ImageIcon(uk1);
        ukLabel = new JLabel(uk2);
        ukLabel.setBounds(520, 150, 200, 100);
        panel.add(ukLabel);

        ukTextLabel = new JLabel("UK");
        ukTextLabel.setBounds(610, 260, 100, 30);
        panel.add(ukTextLabel);

        ukCostLabel = new JLabel("Cost: 30,00,000 BDT");
        ukCostLabel.setBounds(570, 290, 200, 30);
        panel.add(ukCostLabel);

        // Canada Image
        cd = new ImageIcon("./img/cdf.jpg");
        Image cd1 = cd.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        cd2 = new ImageIcon(cd1);
        cdLabel = new JLabel(cd2);
        cdLabel.setBounds(770, 150, 200, 100);
        panel.add(cdLabel);

        cdTextLabel = new JLabel("CANADA");
        cdTextLabel.setBounds(850, 260, 100, 40);
        panel.add(cdTextLabel);

        cdCostLabel = new JLabel("Cost: 40,00,000 BDT");
        cdCostLabel.setBounds(820, 290, 200, 30);
        panel.add(cdCostLabel);

        // Search Title
        searchTextLabel = new JLabel("Input Your Country Name:");
        searchTextLabel.setBounds(380, 360, 300, 30);
        searchFont = new Font("Cambria", Font.BOLD, 20);
        searchTextLabel.setFont(searchFont);
        panel.add(searchTextLabel);

        nameField = new JTextField();
        nameField.setBounds(400, 400, 200, 30);
        panel.add(nameField);

        // Buttons
        nextBtn = new JButton("Next");
        nextBtn.setBounds(430, 450, 140, 30);
        nextBtn.addActionListener(this);
        nextBtn.setBackground(Color.WHITE);
        nextBtn.setForeground(Color.BLACK);

        backBtn = new JButton("Back");
        backBtn.setBounds(430, 505, 140, 30);
        backBtn.addActionListener(this);
        backBtn.setBackground(Color.WHITE);
        backBtn.setForeground(Color.BLACK);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(430, 560, 140, 30);
        exitBtn.setBackground(exitBtnColor);
        exitBtn.addActionListener(this);

        panel.add(nextBtn);
        panel.add(backBtn);
        panel.add(exitBtn);

        super.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        String country = nameField.getText();
        if (ae.getSource() == nextBtn) {
            if (country.equals("USA") || country.equals("usa") || country.equals("United States")
                    || country.equals("united states")) {
                Usa usa = new Usa();
                usa.setVisible(true);
                this.setVisible(false);
            } else if (country.equals("AUS") || country.equals("aus") || country.equals("Australia")
                    || country.equals("australia")) {
                Aus aus = new Aus();
                aus.setVisible(true);
                this.setVisible(false);
            } else if (country.equals("UK") || country.equals("uk") || country.equals("United Kingdom")
                    || country.equals("united kingdom")) {
                Uk uk = new Uk();
                uk.setVisible(true);
                this.setVisible(false);
            } else if (country.equals("CANADA") || country.equals("canada") || country.equals("Canada")
                    || country.equals("canada")) {
                Canada canada = new Canada();
                canada.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Write a valid country name!!");
            }
        } else if (ae.getSource() == backBtn) {
            DashBoard o = new DashBoard();
            o.setVisible(true);
            super.setVisible(false);
        } else if (ae.getSource() == exitBtn) {
            System.exit(0);
        }
    }
}
