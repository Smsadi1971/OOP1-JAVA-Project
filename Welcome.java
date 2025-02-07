import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame implements ActionListener {
    private JPanel panel;
    private ImageIcon ic;
    private JLabel lb1, lb2, lb4, lb5;
    private Font f1, f3, f4;
    private Color c4, c5;
    private JButton b1, b2;

    public Welcome() {
        super("International Education Management System");
        super.setSize(1000, 720);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        lb2 = new JLabel("Full-fill your Dream");
        lb2.setBounds(640, 250, 310, 40);
        f1 = new Font("Cambria", Font.BOLD, 24);
        lb2.setFont(f1);
        // c1 = new Color(195, 28, 220);
        lb2.setForeground(Color.BLACK);
        panel.add(lb2);

        lb4 = new JLabel("Study Abroad");
        lb4.setBounds(460, 650, 150, 30);
        f3 = new Font("Cambria", Font.BOLD, 10);
        lb4.setFont(f3);
        c4 = new Color(58, 63, 59);
        lb4.setForeground(c4);
        // panel.add(lb4);

        lb5 = new JLabel("International Education Management System");
        lb5.setBounds(130, 85, 800, 60);
        f4 = new Font("Cambria", Font.BOLD, 35);
        lb5.setFont(f4);
        c5 = new Color(0, 0, 0);
        lb5.setForeground(c5);
        panel.add(lb5);

        b1 = new JButton(">>>>");
        b1.setBounds(700, 310, 80, 20);
        // c3 = new Color(55, 181, 41);
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Contribution");
        b2.setBounds(790, 610, 130, 30);
        // c6 = new Color(55, 181, 41);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ic = new ImageIcon("./img/Welcome.png");
        lb1 = new JLabel(ic);
        lb1.setBounds(50, 140, 500, 500);
        panel.add(lb1);

        super.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            Login obj1 = new Login();
            obj1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == b2) {
            Contribution obj2 = new Contribution();
            obj2.setVisible(true);
            this.setVisible(false);
        }
    }
}
