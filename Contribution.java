import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contribution extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18,
			lb19, lb20, lb21;
	private Font f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21;
	private Color c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21;
	private JButton b1;
	private ImageIcon ic;

	public Contribution() {
		super("Contribution");
		super.setSize(1000, 720);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);

		lb1 = new JLabel(" International   Education    Management   System");
		lb1.setBounds(150, 50, 690, 40);
		f1 = new Font("Cambria", Font.BOLD, 30);
		lb1.setFont(f1);
		c1 = new Color(0, 0, 0);
		lb1.setOpaque(true);
		lb1.setForeground(c1);
		panel.add(lb1);

		lb2 = new JLabel("Object Oriented Programming 1 (java)");
		lb2.setBounds(280, 110, 460, 30);
		f2 = new Font("Cambria", Font.BOLD, 25);
		lb2.setFont(f2);
		c2 = new Color(0, 0, 0);
		lb2.setOpaque(true);
		lb2.setForeground(c2);
		panel.add(lb2);

		lb3 = new JLabel("American International University-Bangladesh");
		lb3.setBounds(300, 150, 400, 25);
		f3 = new Font("Cambria", Font.BOLD, 18);
		lb3.setFont(f3);
		c3 = new Color(0, 0, 0);
		lb3.setOpaque(true);
		lb3.setForeground(c3);
		panel.add(lb3);

		lb20 = new JLabel("Course Teacher : Nyme Ahmed");
		lb20.setBounds(360, 180, 260, 25);
		f21 = new Font("Cambria", Font.BOLD, 18);
		lb20.setFont(f21);
		c21 = new Color(0, 0, 0);
		lb20.setOpaque(true);
		lb20.setForeground(c21);
		panel.add(lb20);

		lb4 = new JLabel("Name: S M SAKIB AL MAHMUD SADI");
		lb4.setBounds(50, 250, 300, 20);
		f4 = new Font("Cambria", Font.BOLD, 16);
		lb4.setFont(f4);
		c4 = new Color(0, 0, 0);
		lb4.setOpaque(true);
		lb4.setForeground(c4);
		panel.add(lb4);

		lb5 = new JLabel("Id : 24-56019-1");
		lb5.setBounds(50, 280, 300, 20);
		f5 = new Font("Cambria", Font.BOLD, 16);
		lb5.setFont(f5);
		c5 = new Color(0, 0, 0);
		lb5.setOpaque(true);
		lb5.setForeground(c5);
		panel.add(lb5);

		lb6 = new JLabel("Gender : Male");
		lb6.setBounds(50, 310, 300, 20);
		f6 = new Font("Cambria", Font.BOLD, 16);
		lb6.setFont(f5);
		c6 = new Color(0, 0, 0);
		lb6.setOpaque(true);
		lb6.setForeground(c6);
		// panel.add(lb6);

		lb6 = new JLabel("Section : I");
		lb6.setBounds(50, 340, 300, 20);
		f6 = new Font("Cambria", Font.BOLD, 16);
		lb6.setFont(f5);
		c6 = new Color(0, 0, 0);
		lb6.setOpaque(true);
		lb6.setForeground(c6);
		// panel.add(lb6);

		lb7 = new JLabel("Name: DIBOSH RAHMAN");
		lb7.setBounds(50, 400, 300, 20);
		f7 = new Font("Cambria", Font.BOLD, 16);
		lb7.setFont(f7);
		c7 = new Color(0, 0, 0);
		lb7.setOpaque(true);
		lb7.setForeground(c7);
		panel.add(lb7);

		lb8 = new JLabel("Id : 24-56022-1");
		lb8.setBounds(50, 430, 300, 20);
		f8 = new Font("Cambria", Font.BOLD, 16);
		lb8.setFont(f8);
		c8 = new Color(0, 0, 0);
		lb8.setOpaque(true);
		lb8.setForeground(c8);
		panel.add(lb8);

		lb9 = new JLabel("Gender : Female");
		lb9.setBounds(50, 460, 300, 20);
		f9 = new Font("Cambria", Font.BOLD, 16);
		lb9.setFont(f9);
		c9 = new Color(0, 0, 0);
		lb9.setOpaque(true);
		lb9.setForeground(c9);
		// panel.add(lb9);

		lb10 = new JLabel("Section : I");
		lb10.setBounds(50, 490, 300, 20);
		f10 = new Font("Cambria", Font.BOLD, 16);
		lb10.setFont(f10);
		c10 = new Color(0, 0, 0);
		lb10.setOpaque(true);
		lb10.setForeground(c10);
		// panel.add(lb10);

		lb11 = new JLabel("Name: MD MAZDI HOSSAIN");
		lb11.setBounds(550, 250, 300, 20);
		f11 = new Font("Cambria", Font.BOLD, 16);
		lb11.setFont(f7);
		c11 = new Color(0, 0, 0);
		lb11.setOpaque(true);
		lb11.setForeground(c11);
		panel.add(lb11);

		lb12 = new JLabel("Id : 23-52667-2");
		lb12.setBounds(550, 280, 300, 20);
		f12 = new Font("Cambria", Font.BOLD, 16);
		lb12.setFont(f12);
		c12 = new Color(0, 0, 0);
		lb12.setOpaque(true);
		lb12.setForeground(c12);
		panel.add(lb12);

		lb13 = new JLabel("Gender : Male");
		lb13.setBounds(550, 310, 300, 20);
		f13 = new Font("Cambria", Font.BOLD, 16);
		lb13.setFont(f13);
		c13 = new Color(0, 0, 0);
		lb13.setOpaque(true);
		lb13.setForeground(c13);
		// panel.add(lb13);

		lb14 = new JLabel("Section : I");
		lb14.setBounds(550, 340, 300, 20);
		f14 = new Font("Cambria", Font.BOLD, 16);
		lb14.setFont(f14);
		c14 = new Color(0, 0, 0);
		lb14.setOpaque(true);
		lb14.setForeground(c14);
		// panel.add(lb14);

		lb15 = new JLabel("Name: ARIF ANJUM");
		lb15.setBounds(550, 400, 300, 20);
		f15 = new Font("Cambria", Font.BOLD, 16);
		lb15.setFont(f15);
		c15 = new Color(0, 0, 0);
		lb15.setOpaque(true);
		lb15.setForeground(c15);
		panel.add(lb15);

		lb16 = new JLabel("Id : 24-56018-1");
		lb16.setBounds(550, 430, 300, 20);
		f16 = new Font("Cambria", Font.BOLD, 16);
		lb16.setFont(f16);
		c16 = new Color(0, 0, 0);
		lb16.setOpaque(true);
		lb16.setForeground(c16);
		panel.add(lb16);

		lb17 = new JLabel("Gender : Male");
		lb17.setBounds(550, 460, 300, 20);
		f17 = new Font("Cambria", Font.BOLD, 16);
		lb17.setFont(f17);
		c17 = new Color(0, 0, 0);
		lb17.setOpaque(true);
		lb17.setForeground(c17);
		// panel.add(lb17);

		lb18 = new JLabel("Section : I");
		lb18.setBounds(550, 490, 300, 20);
		f18 = new Font("Cambria", Font.BOLD, 16);
		lb18.setFont(f18);
		c18 = new Color(0, 0, 0);
		lb18.setOpaque(true);
		lb18.setForeground(c18);
		lb18.setForeground(c18);
		// panel.add(lb18);

		lb19 = new JLabel("Study Abroad");
		lb19.setBounds(425, 650, 150, 30);
		f20 = new Font("Cambria", Font.BOLD, 10);
		lb19.setFont(f20);
		c20 = new Color(0, 0, 0);
		lb19.setForeground(c20);
		panel.add(lb19);

		// Button

		b1 = new JButton("OK");
		b1.setBounds(410, 570, 100, 30);
		// c19 = new Color(232, 144, 57);
		f19 = new Font("Cambria", Font.BOLD, 14);
		b1.setFont(f19);
		b1.setBackground(Color.WHITE);
		b1.addActionListener(this);
		panel.add(b1);

		// image

		ic = new ImageIcon("./img/Contribution.png");
		lb21 = new JLabel(ic);
		lb21.setBounds(0, 0, 1000, 720);
		panel.add(lb21);

		super.add(panel);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			Welcome o = new Welcome();
			this.setVisible(false);
			o.setVisible(true);
		}
	}

}