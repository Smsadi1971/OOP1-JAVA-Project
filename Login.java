import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

	private JPanel panel;
	private ImageIcon ic, ic1;
	private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9;
	private Font f1, f2, f3, f4, f5, f6, f7, f8, f9;
	private Color c2, c3, c4, c5, c6, c7, c9;
	private JTextField tf1;
	private JPasswordField pf1;
	private JButton b1, b2, b3;

	public Login() {
		super("International Education Management System");
		super.setSize(1000, 720);
		super.setLocationRelativeTo(null);

		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);

		lb3 = new JLabel("Study Abroad");
		lb3.setBounds(35, 15, 100, 20);
		f1 = new Font("Cambria", Font.ITALIC, 15);
		lb3.setFont(f1);
		// c1 = new Color(55, 181, 41);
		lb3.setOpaque(true);
		// lb3.setForeground(c1);
		panel.add(lb3);

		lb4 = new JLabel("Log in to your account");
		lb4.setBounds(120, 150, 300, 40);
		f2 = new Font("Cambria", Font.BOLD, 24);
		lb4.setFont(f2);
		c2 = new Color(0, 0, 0);
		lb4.setForeground(c2);
		panel.add(lb4);

		lb5 = new JLabel("Welcome! Please enter your details.");
		lb5.setBounds(120, 180, 300, 40);
		f3 = new Font("Cambria", Font.BOLD, 14);
		lb5.setFont(f3);
		c3 = new Color(95, 89, 89);
		lb5.setForeground(c3);
		panel.add(lb5);

		lb6 = new JLabel("UserName");
		lb6.setBounds(120, 230, 300, 40);
		f4 = new Font("Cambria", Font.BOLD, 13);
		lb6.setFont(f4);
		c4 = new Color(58, 63, 59);
		lb6.setForeground(c4);
		panel.add(lb6);

		lb7 = new JLabel("Password");
		lb7.setBounds(120, 300, 300, 40);
		f5 = new Font("Cambria", Font.BOLD, 14);
		lb7.setFont(f5);
		c5 = new Color(58, 63, 59);
		lb7.setForeground(c5);
		panel.add(lb7);

		lb8 = new JLabel("Don't have an account?");
		lb8.setBounds(140, 430, 150, 30);
		f7 = new Font("Cambria", Font.BOLD, 14);
		lb8.setFont(f7);
		c7 = new Color(58, 63, 59);
		lb8.setForeground(c7);
		panel.add(lb8);

		lb9 = new JLabel("Study Abroad");
		lb9.setBounds(205, 650, 150, 30);
		f9 = new Font("Cambria", Font.BOLD, 13);
		lb9.setFont(f9);
		c9 = new Color(58, 63, 59);
		lb9.setForeground(c9);
		panel.add(lb9);

		// TextField

		tf1 = new JTextField();
		tf1.setBounds(120, 265, 250, 25);
		panel.add(tf1);

		// PasswordField
		pf1 = new JPasswordField();
		pf1.setBounds(120, 335, 250, 25);
		pf1.setEchoChar('*');
		panel.add(pf1);

		// Button
		b1 = new JButton("Sign In");
		b1.setBounds(120, 380, 250, 30);
		c6 = new Color(37, 145, 25);
		f6 = new Font("Cambria", Font.BOLD, 14);
		b1.setFont(f6);
		b1.setBackground(Color.RED);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		panel.add(b1);

		b2 = new JButton("...");
		b2.setBounds(302, 435, 50, 20);
		// c8 = new Color(37, 145, 25);
		f8 = new Font("Cambria", Font.BOLD, 14);
		b2.setFont(f8);
		b2.setBackground(Color.RED);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		panel.add(b2);

		b3 = new JButton("Admin");
		b3.setBounds(210, 470, 75, 25);
		// c6 = new Color(55, 181, 41);
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.BLACK);
		b3.addActionListener(this);
		panel.add(b3);

		// image
		ic = new ImageIcon("./img/Image1.png");
		lb1 = new JLabel(ic);
		lb1.setBounds(500, 0, 500, 720);
		panel.add(lb1);

		ic1 = new ImageIcon("./img/logo.png");
		lb2 = new JLabel(ic1);
		lb2.setBounds(10, 15, 20, 20);
		panel.add(lb2);

		super.add(panel);

	}

	public void actionPerformed(ActionEvent ae) {
		String userName;
		userName = tf1.getText();
		if (ae.getSource() == b2) {
			Register obj1 = new Register();
			obj1.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == b3) {
			AdminLogin obj1 = new AdminLogin();
			obj1.setVisible(true);
			this.setVisible(false);
			JOptionPane.showMessageDialog(this, "Default Admin ID: admin\nDefault Password: admin");
		} else if (ae.getSource() == b1) {
			String name, pass;
			name = tf1.getText();
			pass = pf1.getText();
			if (name.isEmpty() || pass.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please fill up all the info");
			} else {
				Account acco = new Account(name, pass);
				if (acco.checkAccount() == true) {
					JOptionPane.showMessageDialog(this, "Login Successful");
					DashBoard obj1 = new DashBoard();
					obj1.setVisible(true);
					this.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(this, "Invalid ID or Password");
				}
			}
		}
	}
}