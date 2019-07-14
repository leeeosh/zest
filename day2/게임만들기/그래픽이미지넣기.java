package 게임만들기;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 그래픽이미지넣기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 559);
		
		JButton btnNewButton = new JButton("\uAC00\uC704");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가위를 누르셨군요");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				if (computer==0) {
					System.out.println("비겼음");
				} 
				else if(computer == 1){
					System.out.println("컴퓨터 승");

				}
				else {
					System.out.println("유저 승");
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\\uD559\uC0DD\uBC29\\LSH\\day02\\\uAC00\uC704.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uBC14\uC704");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("바위를 누르셨군요");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				if (computer==0) {
					System.out.println("유저 승");
				} 
				else if(computer == 1){
					System.out.println("비겼음");

				}
				else {
					System.out.println("컴퓨터 승");
				}
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\\uD559\uC0DD\uBC29\\LSH\\day02\\\uBC14\uC704.jpg"));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uBCF4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("보를 누르셨군요");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				if (computer==0) {
					System.out.println("컴퓨터 승");
				} 
				else if(computer == 1){
					System.out.println("유저 승");

				}
				else {
					System.out.println("비겼음");
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\\uD559\uC0DD\uBC29\\LSH\\day02\\\uBCF4.jpg"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		
				
		
		f.setVisible(true);

	}

}
