package �߱���;

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
		f.setTitle("�߱� ����");
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		ImageIcon icon = new ImageIcon("paper.png");
		ImageIcon jja = new ImageIcon("jja.png");
		ImageIcon jam = new ImageIcon("jjam.png");
		ImageIcon uu = new ImageIcon("uu.png");
		JLabel mon = new JLabel();
		mon.setFont(new Font("����", Font.PLAIN, 19));
		f.getContentPane().add(mon);
		JLabel pic = new JLabel();
		JLabel labe2 = new JLabel();
		labe2.setFont(new Font("����", Font.PLAIN, 13));
		f.getContentPane().add(pic);

		pic.setIcon(icon);
		mon.setText("�߱���");

		JLabel label = new JLabel();
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic.setIcon(jam);
				count1++;
				total = total + 7000;
				mon.setText("«�� " + count1 + "�� " + "�쵿 " + count2 + "�� " + "¥�� " + count3 + "��");
				labe2.setText(
						"«�� " + count1 * 7000 + "�� " + "�쵿 " + count2 * 6000 + "�� " + "¥�� " + count3 * 4500 + "��");
				label.setText(total + "��");

			}
		});
		b1.setFont(new Font("����", Font.PLAIN, 25));
		f.getContentPane().add(b1);
		b1.setText("«��");
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic.setIcon(uu);
				count2++;
				total = total + 6000;
				mon.setText("«�� " + count1 + "�� " + "�쵿 " + count2 + "�� " + "¥�� " + count3 + "��");
				labe2.setText(
						"«�� " + count1 * 7000 + "�� " + "�쵿 " + count2 * 6000 + "�� " + "¥�� " + count3 * 4500 + "��");

				label.setText(total + "��");
			}
		});
		b2.setFont(new Font("����", Font.PLAIN, 25));
		f.getContentPane().add(b2);
		b2.setText("�쵿");
		JButton b3 = new JButton();
		b3.setFont(new Font("����", Font.PLAIN, 25));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pic.setIcon(jja);
				count3++;
				total = total + 4500;
				mon.setText("«�� " + count1 + "�� " + "�쵿 " + count2 + "�� " + "¥�� " + count3 + "��");
				labe2.setText(
						"«�� " + count1 * 7000 + "�� " + "�쵿 " + count2 * 6000 + "�� " + "¥�� " + count3 * 4500 + "��");
				label.setText(total + "��");
			}
		});
		f.getContentPane().add(b3);
		b3.setText("����");

		label.setFont(new Font("����", Font.PLAIN, 50));
		f.getContentPane().add(label);
		f.getContentPane().add(labe2);

		f.setVisible(true);

	}

}
