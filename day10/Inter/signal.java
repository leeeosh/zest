package Inter;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class signal extends JFrame {

	public signal() {
		getContentPane().setBackground(Color.BLACK);
		setTitle("신호등");
		setSize(301, 292);
		getContentPane().setLayout(new FlowLayout());

		JButton red = new JButton("\uBE68\uAC15\uC2E0\uD638");
		red.setFont(new Font("굴림", Font.BOLD, 57));
		red.setBackground(Color.RED);
		getContentPane().add(red);

		JButton yellow = new JButton("\uB178\uB791\uC2E0\uD638");
		yellow.setFont(new Font("굴림", Font.BOLD, 57));
		yellow.setBackground(Color.YELLOW);
		getContentPane().add(yellow);

		JButton blue = new JButton("\uD30C\uB791\uC2E0\uD638");
		blue.setFont(new Font("굴림", Font.BOLD, 57));
		blue.setBackground(Color.BLUE);
		getContentPane().add(blue);

		Red처리기 r = new Red처리기();
		red.addActionListener(r);
		Yellow처리기 y = new Yellow처리기();
		yellow.addActionListener(y);
		Blue처리기 b = new Blue처리기();
		blue.addActionListener(b);

		setVisible(true);
	}

	public static void main(String[] args) {
		signal name = new signal();
	}

}