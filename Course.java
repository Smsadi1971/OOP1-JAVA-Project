import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class Course extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel courseLabel, courseImageLabel, ieltsTextLabel, ieltsLabel, greTextLabel, greLabel, satTextLabel,
            satLabel, ieltsText, greText, satText;
    private Font titleFont, ieltsTitleFont, greTitleFont, satTitleFont;
    private ImageIcon course, course2, ielts, ielts2, gre, gre2, sat, sat2;
    private JButton ieltsBuyButton, greBuyButton, satBuyButton, courseBackButton;

    public Course() {
        super("Course");
        this.setSize(1000, 720);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        // Course Title
        courseLabel = new JLabel("Choose Your Course Now");
        courseLabel.setBounds(250, 40, 620, 50);
        titleFont = new Font("Cambria", Font.BOLD, 40);
        courseLabel.setFont(titleFont);
        panel.add(courseLabel);

        // Course Title Image
        course = new ImageIcon("./img/angry.jpg");
        Image course1 = course.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        course2 = new ImageIcon(course1);
        courseImageLabel = new JLabel(course2);
        courseImageLabel.setBounds(740, 45, 70, 70);
        panel.add(courseImageLabel);

        // IELTS Title
        ieltsTextLabel = new JLabel("IELTS");
        ieltsTextLabel.setBounds(170, 150, 100, 50);
        ieltsTitleFont = new Font("Cambria", Font.BOLD, 25);
        ieltsTextLabel.setFont(ieltsTitleFont);
        panel.add(ieltsTextLabel);

        // IELTS Image
        ielts = new ImageIcon("./img/IELTS.jpg");
        Image ielts1 = ielts.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        ielts2 = new ImageIcon(ielts1);
        ieltsLabel = new JLabel(ielts2);
        ieltsLabel.setBounds(80, 200, 250, 250);
        panel.add(ieltsLabel);

        // IELTS Text
        ieltsText = new JLabel("IELTS Full Course, Price: BDT 22000");
        ieltsText.setBounds(90, 460, 250, 60);
        panel.add(ieltsText);

        // IELTS Buy Button
        ieltsBuyButton = new JButton("Buy");
        ieltsBuyButton.setBounds(170, 510, 65, 32);
        ieltsBuyButton.setBackground(Color.RED);
        ieltsBuyButton.setForeground(Color.WHITE);
        this.ieltsBuyButton.addActionListener(this);
        panel.add(ieltsBuyButton);

        // GRE Title
        greTextLabel = new JLabel("GRE");
        greTextLabel.setBounds(470, 150, 100, 50);
        greTitleFont = new Font("Cambria", Font.BOLD, 25);
        greTextLabel.setFont(greTitleFont);
        panel.add(greTextLabel);

        // GRE Image
        gre = new ImageIcon("./img/GRE.jpg");
        Image gre1 = gre.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        gre2 = new ImageIcon(gre1);
        greLabel = new JLabel(gre2);
        greLabel.setBounds(380, 200, 250, 250);
        panel.add(greLabel);

        // GRE Text
        greText = new JLabel("GRE Full Prep, Price: BDT 18500");
        greText.setBounds(390, 460, 250, 60);
        panel.add(greText);

        // GRE Buy Button
        greBuyButton = new JButton("Buy");
        greBuyButton.setBounds(470, 510, 65, 32);
        greBuyButton.setBackground(Color.RED);
        greBuyButton.setForeground(Color.WHITE);
        this.greBuyButton.addActionListener(this);
        panel.add(greBuyButton);

        // SAT Title
        satTextLabel = new JLabel("SAT");
        satTextLabel.setBounds(770, 150, 100, 50);
        satTitleFont = new Font("Cambria", Font.BOLD, 25);
        satTextLabel.setFont(satTitleFont);
        panel.add(satTextLabel);

        // SAT Image
        sat = new ImageIcon("./img/SAT.jpg");
        Image sat1 = sat.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        sat2 = new ImageIcon(sat1);
        satLabel = new JLabel(sat2);
        satLabel.setBounds(680, 200, 250, 250);
        panel.add(satLabel);

        // SAT Text
        satText = new JLabel("SAT Full Course, Price: BDT 14000");
        satText.setBounds(690, 460, 250, 60);
        panel.add(satText);

        // SAT Buy Button
        satBuyButton = new JButton("Buy");
        satBuyButton.setBounds(770, 510, 65, 32);
        satBuyButton.setBackground(Color.RED);
        satBuyButton.setForeground(Color.WHITE);
        satBuyButton.addActionListener(this);
        panel.add(satBuyButton);

        // Course Back Button
        courseBackButton = new JButton("Back");
        courseBackButton.setBounds(470, 560, 65, 32);
        courseBackButton.setBackground(Color.WHITE);
        courseBackButton.setForeground(Color.BLACK);
        courseBackButton.addActionListener(this);
        panel.add(courseBackButton);

        super.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == ieltsBuyButton) {
            Payment obj1 = new Payment("IELTS", 22000.00);
            obj1.setVisible(true);
            this.setVisible(false);
        }
        if (ae.getSource() == greBuyButton) {
            Payment obj1 = new Payment("GRE", 18500.00);
            obj1.setVisible(true);
            this.setVisible(false);
        }
        if (ae.getSource() == satBuyButton) {
            Payment obj1 = new Payment("SAT", 14000.00);
            obj1.setVisible(true);
            this.setVisible(false);
        }
        if (ae.getSource() == courseBackButton) {
            DashBoard obj1 = new DashBoard();
            obj1.setVisible(true);
            this.setVisible(false);
        }
    }
}
