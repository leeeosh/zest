package 게임만들기;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class 음식 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("음식");
		f.setSize(1000, 500);
		
		JButton btnNewButton = new JButton("\uBA54\uB274\uD310\uC785\uB2C8\uB2E4.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("D:\\\uD559\uC0DD\uBC29\\LSH\\day02\\\uCEA1\uCC982.PNG"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("짬뽕 먹으러 가요");
			}
		});
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("D:\\\uD559\uC0DD\uBC29\\LSH\\day02\\\uCEA1\uCC983.PNG"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("우동 먹으러 가요");
			}
		});
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("D:\\\uD559\uC0DD\uBC29\\LSH\\day02\\\uCEA1\uCC98.PNG"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("짜장면 먹으러 가요");
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		f.setVisible(true);
	}

}
