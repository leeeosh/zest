package Inter;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class signal extends JFrame {

	public signal() {
		getContentPane().setBackground(Color.BLACK);
		setTitle("��ȣ��");
		setSize(301, 292);
		getContentPane().setLayout(new FlowLayout());

		JButton red = new JButton("\uBE68\uAC15\uC2E0\uD638");
		red.setFont(new Font("����", Font.BOLD, 57));
		red.setBackground(Color.RED);
		getContentPane().add(red);

		JButton yellow = new JButton("\uB178\uB791\uC2E0\uD638");
		yellow.setFont(new Font("����", Font.BOLD, 57));
		yellow.setBackground(Color.YELLOW);
		getContentPane().add(yellow);

		JButton blue = new JButton("\uD30C\uB791\uC2E0\uD638");
		blue.setFont(new Font("����", Font.BOLD, 57));
		blue.setBackground(Color.BLUE);
		getContentPane().add(blue);

		Redó���� r = new Redó����();
		red.addActionListener(r);
		Yellowó���� y = new Yellowó����();
		yellow.addActionListener(y);
		Blueó���� b = new Blueó����();
		blue.addActionListener(b);

		setVisible(true);
	}

	public static void main(String[] args) {
		signal name = new signal();
	}

}