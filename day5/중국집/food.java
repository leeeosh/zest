package Áß±¹Áý;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class food {

	static int count1 = 0;
	static int count2 = 0;
	static int count3 = 0;
	static int total = 0;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(310, 550);
		f.setTitle("Áß±¹ À½½Ä");
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		ImageIcon icon = new ImageIcon("paper.png");
		ImageIcon jja = new ImageIcon("jja.png");
		ImageIcon jam = new ImageIcon("jjam.png");
		ImageIcon uu = new ImageIcon("uu.png");
		JLabel mon = new JLabel();
		mon.setFont(new Font("±¼¸²", Font.PLAIN, 19));
		f.getContentPane().add(mon);
		JLabel pic = new JLabel();
		JLabel labe2 = new JLabel();
		labe2.setFont(new Font("±¼¸²", Font.PLAIN, 13));
		f.getContentPane().add(pic);

		pic.setIcon(icon);
		mon.setText("Áß±¹Áý");

		JLabel label = new JLabel();
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic.setIcon(jam);
				count1++;
				total = total + 7000;
				mon.setText("Â«»Í " + count1 + "°³ " + "¿ìµ¿ " + count2 + "°³ " + "Â¥Àå " + count3 + "°³");
				labe2.setText(
						"Â«»Í " + count1 * 7000 + "¿ø " + "¿ìµ¿ " + count2 * 6000 + "¿ø " + "Â¥Àå " + count3 * 4500 + "¿ø");
				label.setText(total + "¿ø");

			}
		});
		b1.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		f.getContentPane().add(b1);
		b1.setText("Â«»Í");
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic.setIcon(uu);
				count2++;
				total = total + 6000;
				mon.setText("Â«»Í " + count1 + "°³ " + "¿ìµ¿ " + count2 + "°³ " + "Â¥Àå " + count3 + "°³");
				labe2.setText(
						"Â«»Í " + count1 * 7000 + "¿ø " + "¿ìµ¿ " + count2 * 6000 + "¿ø " + "Â¥Àå " + count3 * 4500 + "¿ø");

				label.setText(total + "¿ø");
			}
		});
		b2.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		f.getContentPane().add(b2);
		b2.setText("¿ìµ¿");
		JButton b3 = new JButton();
		b3.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pic.setIcon(jja);
				count3++;
				total = total + 4500;
				mon.setText("Â«»Í " + count1 + "°³ " + "¿ìµ¿ " + count2 + "°³ " + "Â¥Àå " + count3 + "°³");
				labe2.setText(
						"Â«»Í " + count1 * 7000 + "¿ø " + "¿ìµ¿ " + count2 * 6000 + "¿ø " + "Â¥Àå " + count3 * 4500 + "¿ø");
				label.setText(total + "¿ø");
			}
		});
		f.getContentPane().add(b3);
		b3.setText("ÀÚÀå");

		label.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		f.getContentPane().add(label);
		f.getContentPane().add(labe2);

		f.setVisible(true);

	}

}
