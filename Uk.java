import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Uk extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel imgLabel, imgLabel1, imgLabel2, imgLabel3, imgLabel4, imgLabel5;
    private JButton payBtn, backBtn;
    private ImageIcon img1, img2, img3, img4, img5, img6;
    private JRadioButton huRadio, mitRadio, puRadio, suRadio;
    private ButtonGroup bg;

    public Uk() {
        super("UNITED KINGDOM");
        super.setSize(1000, 720);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        payBtn = new JButton("Pay");
        payBtn.setBounds(630, 120, 120, 40);
        payBtn.setForeground(Color.WHITE);
        payBtn.setBackground(Color.RED);
        payBtn.setOpaque(true);
        payBtn.addActionListener(this);

        backBtn = new JButton("Back");
        backBtn.setBounds(800, 120, 120, 40);
        backBtn.addActionListener(this);
        backBtn.setForeground(Color.BLACK);
        backBtn.setBackground(Color.WHITE);

        img1 = new ImageIcon("./img/ukk.png");
        img2 = new ImageIcon("./img/ox.png");
        img3 = new ImageIcon("./img/yy.png");
        img4 = new ImageIcon("./img/cm.png");
        img5 = new ImageIcon("./img/jj.png");
        img6 = new ImageIcon("./img/ld.png");

        imgLabel = new JLabel(img1);
        imgLabel.setBounds(65, 10, 380, 230);

        imgLabel1 = new JLabel(img2);
        imgLabel1.setBounds(65, 280, 151, 147);

        huRadio = new JRadioButton();
        huRadio.setBounds(250, 300, 30, 30);
        huRadio.setBackground(Color.WHITE);

        imgLabel2 = new JLabel(img3);
        imgLabel2.setBounds(35, 435, 200, 200);

        mitRadio = new JRadioButton();
        mitRadio.setBounds(250, 490, 30, 30);
        mitRadio.setBackground(Color.WHITE);

        imgLabel3 = new JLabel(img4);
        imgLabel3.setBounds(370, 260, 151, 192);

        puRadio = new JRadioButton();
        puRadio.setBounds(540, 305, 30, 30);
        puRadio.setBackground(Color.WHITE);

        imgLabel4 = new JLabel(img5);
        imgLabel4.setBounds(330, 445, 230, 230);

        suRadio = new JRadioButton();
        suRadio.setBounds(540, 490, 30, 30);
        suRadio.setBackground(Color.WHITE);

        imgLabel5 = new JLabel(img6);
        imgLabel5.setBounds(625, 200, 350, 490);

        bg = new ButtonGroup();
        bg.add(huRadio);
        bg.add(mitRadio);
        bg.add(puRadio);
        bg.add(suRadio);

        panel.add(payBtn);
        panel.add(backBtn);
        panel.add(imgLabel);
        panel.add(imgLabel1);
        panel.add(imgLabel2);
        panel.add(huRadio);
        panel.add(mitRadio);
        panel.add(imgLabel3);
        panel.add(puRadio);
        panel.add(imgLabel4);
        panel.add(suRadio);
        panel.add(imgLabel5);

        panel.add(payBtn);
        panel.add(backBtn);

        super.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == payBtn) {
            if (bg.isSelected(null)) {
                JOptionPane.showMessageDialog(this, "Please select a university");
            } else {
                Payment o = new Payment("UK", 3000000.00);
                o.setVisible(true);
                this.setVisible(false);
            }
        } else if (ae.getSource() == backBtn) {
            Apply o = new Apply();
            o.setVisible(true);
            super.setVisible(false);
        }
    }
}