import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel lb1, lb2, lb3, lb4, lb5;
	private ImageIcon ic;
	private Font f1, f2, f3, f4, f5, f6;
	private Color c2, c3, c4;
	private JTextField tf1;
	private JPasswordField pf1;
	private JButton b1, b2;

	public AdminLogin() {
		super("                                                                          International   Education    Management   System");
		super.setSize(1000, 720);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);

		lb1 = new JLabel("Study Abroad Admin Login");
		lb1.setBounds(560, 120, 320, 25);
		f1 = new Font("Cambria", Font.BOLD, 25);
		lb1.setFont(f1);
		setBackground(Color.WHITE);
		lb1.setOpaque(true);
		lb1.setForeground(Color.RED);
		panel.add(lb1);

		lb2 = new JLabel("Admin ID*");
		lb2.setBounds(600, 190, 100, 20);
		f2 = new Font("Cambria", Font.BOLD, 16);
		lb2.setFont(f2);
		c2 = new Color(58, 63, 59);
		lb2.setForeground(c2);
		panel.add(lb2);

		lb4 = new JLabel("Password*");
		lb4.setBounds(600, 260, 100, 20);
		f3 = new Font("Cambria", Font.BOLD, 16);
		lb4.setFont(f3);
		c3 = new Color(58, 63, 59);
		lb4.setForeground(c3);
		panel.add(lb4);

		lb5 = new JLabel("Study Abroad");
		lb5.setBounds(670, 650, 150, 30);
		f4 = new Font("Cambria", Font.BOLD, 10);
		lb5.setFont(f4);
		c4 = new Color(58, 63, 59);
		lb5.setForeground(c4);
		panel.add(lb5);

		tf1 = new JTextField();
		tf1.setBounds(600, 220, 250, 30);
		panel.add(tf1);

		pf1 = new JPasswordField();
		pf1.setBounds(600, 290, 250, 30);
		pf1.setEchoChar('*');
		panel.add(pf1);

		b1 = new JButton("Sign In");
		b1.setBounds(600, 350, 100, 30);
		f5 = new Font("Cambria", Font.BOLD, 14);
		b1.setFont(f5);
		b1.setOpaque(true);
		b1.setBackground(Color.RED);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		panel.add(b1);

		b2 = new JButton("Back");
		b2.setBounds(750, 350, 100, 30);
		f6 = new Font("Cambria", Font.BOLD, 14);
		b2.setFont(f6);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		panel.add(b2);

		ic = new ImageIcon("./img/Admin.png");
		lb3 = new JLabel(ic);
		lb3.setBounds(0, 0, 490, 710);
		panel.add(lb3);

		super.add(panel);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b1) {
			if (tf1.getText().equals("admin") && pf1.getText().equals("admin")) {
				JOptionPane.showMessageDialog(this, "Login Successful");
				AdminPanel o = new AdminPanel();
				o.setVisible(true);
				this.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(this, "Invalid ID or Password");
			}
		} else if (ae.getSource() == b2) {
			Login o = new Login();
			o.setVisible(true);
			this.setVisible(false);
		}
	}
}