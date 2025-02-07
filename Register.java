import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel lb1, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	private ImageIcon ic;
	private Font f2, f3, f4, f5, f6, f7, f8, f9, f10, f11;
	private Color c2, c3, c4, c5, c6, c7, c9, c10, c11;
	private JTextField tf1, tf2, tf3, tf4;
	private JButton b1, b2;

	public Register() {
		super("                                                International Education Management System");
		super.setSize(1000, 720);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);

		// Label
		lb3 = new JLabel("Sign Up");
		lb3.setBounds(570, 100, 300, 30);
		f2 = new Font("Cambria", Font.BOLD, 20);
		lb3.setFont(f2);
		c2 = new Color(0, 0, 0);
		lb3.setForeground(c2);
		panel.add(lb3);

		lb4 = new JLabel("Automate your boring Task");
		lb4.setBounds(570, 125, 300, 40);
		f3 = new Font("Cambria", Font.BOLD, 14);
		lb4.setFont(f3);
		c3 = new Color(95, 89, 89);
		lb4.setForeground(c3);
		panel.add(lb4);

		lb5 = new JLabel("UserName*");
		lb5.setBounds(570, 170, 300, 40);
		f4 = new Font("Cambria", Font.BOLD, 14);
		lb5.setFont(f4);
		c4 = new Color(58, 63, 59);
		lb5.setForeground(c4);
		panel.add(lb5);

		lb6 = new JLabel("Phone Number*");
		lb6.setBounds(570, 240, 300, 40);
		f5 = new Font("Cambria", Font.BOLD, 14);
		lb6.setFont(f5);
		c5 = new Color(58, 63, 59);
		lb6.setForeground(c5);
		panel.add(lb6);

		lb7 = new JLabel("Email*");
		lb7.setBounds(570, 305, 300, 40);
		f6 = new Font("Cambria", Font.BOLD, 14);
		lb7.setFont(f6);
		c6 = new Color(58, 63, 59);
		lb7.setForeground(c6);
		panel.add(lb7);

		lb8 = new JLabel("Password*");
		lb8.setBounds(570, 360, 300, 40);
		f7 = new Font("Cambria", Font.BOLD, 14);
		lb8.setFont(f7);
		c7 = new Color(58, 63, 59);
		lb8.setForeground(c7);
		panel.add(lb8);

		lb9 = new JLabel("Already have an account?");
		lb9.setBounds(600, 490, 165, 30);
		f9 = new Font("Cambria", Font.BOLD, 14);
		lb9.setFont(f9);
		c9 = new Color(58, 63, 59);
		lb9.setForeground(c9);
		panel.add(lb9);

		lb10 = new JLabel("Study Abroad Pro 2025");
		lb10.setBounds(670, 650, 150, 30);
		f11 = new Font("Cambria", Font.BOLD, 10);
		lb10.setFont(f11);
		c11 = new Color(58, 63, 59);
		lb10.setForeground(c11);
		// panel.add(lb10);

		// TextField

		tf1 = new JTextField();
		tf1.setBounds(570, 205, 250, 30);
		panel.add(tf1);

		tf2 = new JTextField();
		tf2.setBounds(570, 275, 250, 30);
		panel.add(tf2);

		tf3 = new JTextField();
		tf3.setBounds(570, 395, 250, 30);
		panel.add(tf3);

		tf4 = new JTextField();
		tf4.setBounds(570, 335, 250, 30);
		panel.add(tf4);

		// Button
		b1 = new JButton("Sign Up");
		b1.setBounds(570, 450, 250, 30);
		// c8 = new Color(37, 145, 25);
		f8 = new Font("Cambria", Font.BOLD, 14);
		b1.setFont(f8);
		b1.setBackground(Color.RED);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		panel.add(b1);

		b2 = new JButton("...");
		b2.setBounds(770, 495, 50, 20);
		c10 = new Color(37, 145, 25);
		f10 = new Font("Cambria", Font.BOLD, 14);
		b2.setFont(f10);
		b2.setBackground(Color.RED);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		panel.add(b2);

		// image
		ic = new ImageIcon("./img/Image2.png");
		lb1 = new JLabel(ic);
		lb1.setBounds(0, 0, 500, 720);
		panel.add(lb1);

		ic = new ImageIcon("logo.png");
		lb3 = new JLabel(ic);
		lb3.setBounds(515, 15, 20, 20);
		panel.add(lb3);

		super.add(panel);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b2) {
			Login obj1 = new Login();
			obj1.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == b1) {
			String name, pass, phn, email;
			name = tf1.getText();
			pass = tf3.getText();
			phn = tf2.getText();
			email = tf4.getText();
			if (name.isEmpty() || pass.isEmpty() || phn.isEmpty() || email.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please fill up all the info");
			} else {
				Account acc = new Account(name, pass);
				Account ac = new Account(name, pass, phn, email);
				if (acc.checkAccount() == true) {
					JOptionPane.showMessageDialog(this, "Already exists");
				} else {
					acc.addAccount();
					ac.addInfo();
					JOptionPane.showMessageDialog(this, "Signup Successful");
					Login obj1 = new Login();
					obj1.setVisible(true);
					this.setVisible(false);
				}
			}
		}
	}
}