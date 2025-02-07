import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashBoard extends JFrame implements ActionListener {

	private JPanel panel;
	private JButton studyBtn, applyBtn, loginBtn, exitBtn;
	private Font f1, f11, f12, f13, f14, f15;
	private Color c11, c12, c122, c13, c133, c14, c144, c155, c15;
	private JLabel courseImageLabel, studyLabel, applyLabel, lb1, lb13;
	private ImageIcon course, course2, apply, apply2, study, study2;

	public DashBoard() {
		super("Dashboard");
		super.setSize(1000, 720);
		super.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);

		// Label
		lb1 = new JLabel("Hello User, Welcome To Dashboard");
		lb1.setBounds(200, 35, 700, 50);
		f1 = new Font("Cambria", Font.BOLD, 40);
		lb1.setFont(f1);
		panel.add(lb1);

		course = new ImageIcon("./img/smi.png");
		Image course1 = course.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		course2 = new ImageIcon(course1);
		courseImageLabel = new JLabel(course2);
		courseImageLabel.setBounds(100, 25, 80, 80);
		panel.add(courseImageLabel);

		lb13 = new JLabel("Study Abroad");
		lb13.setBounds(465, 650, 150, 30);
		f11 = new Font("Cambria", Font.BOLD, 12);
		lb13.setFont(f11);
		c11 = new Color(58, 63, 59);
		lb13.setForeground(c11);
		panel.add(lb13);

		// image
		study = new ImageIcon("./img/Study.png");
		Image study1 = study.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
		study2 = new ImageIcon(study1);
		studyLabel = new JLabel(study2);
		studyLabel.setBounds(100, 120, 350, 350);
		panel.add(studyLabel);

		apply = new ImageIcon("./img/Apply.png");
		Image apply1 = apply.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
		apply2 = new ImageIcon(apply1);
		applyLabel = new JLabel(apply2);
		applyLabel.setBounds(550, 120, 350, 350);
		panel.add(applyLabel);

		// Button
		studyBtn = new JButton("Study");
		studyBtn.setBounds(220, 430, 100, 30);
		c12 = new Color(255, 51, 51);
		f12 = new Font("Cambria", Font.BOLD, 16);
		studyBtn.setFont(f12);
		studyBtn.setBackground(c12);
		c122 = new Color(255, 255, 255);
		studyBtn.setForeground(c122);
		studyBtn.addActionListener(this);
		panel.add(studyBtn);

		applyBtn = new JButton("Apply");
		applyBtn.setBounds(680, 430, 100, 30);
		c13 = new Color(255, 51, 51);
		f13 = new Font("Cambria", Font.BOLD, 16);
		applyBtn.setFont(f13);
		applyBtn.setBackground(c13);
		c133 = new Color(255, 255, 255);
		applyBtn.setForeground(c133);
		applyBtn.addActionListener(this);
		panel.add(applyBtn);

		loginBtn = new JButton("Logout");
		loginBtn.setBounds(350, 550, 100, 30);
		c14 = new Color(255, 255, 255);
		f14 = new Font("Cambria", Font.BOLD, 16);
		loginBtn.setFont(f14);
		loginBtn.setBackground(c14);
		c144 = new Color(0, 0, 0);
		loginBtn.setForeground(c144);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);

		exitBtn = new JButton("Exit");
		exitBtn.setBounds(550, 550, 100, 30);
		c15 = new Color(255, 255, 255);
		f15 = new Font("Cambria", Font.BOLD, 16);
		exitBtn.setFont(f15);
		exitBtn.setBackground(c15);
		c155 = new Color(0, 0, 0);
		exitBtn.setForeground(c155);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);

		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == studyBtn) {
			Course courseFrame = new Course();
			courseFrame.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == applyBtn) {
			Apply applyFrame = new Apply();
			applyFrame.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == exitBtn) {
			System.exit(0);
		} else if (ae.getSource() == loginBtn) {
			Login loginFrame = new Login();
			loginFrame.setVisible(true);
			this.setVisible(false);
		}
	}
}