package ���Ӹ����;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class �׷����̹����ֱ� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 559);
		
		JButton btnNewButton = new JButton("\uAC00\uC704");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ �����̱���");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				if (computer==0) {
					System.out.println("�����");
				} 
				else if(computer == 1){
					System.out.println("��ǻ�� ��");

				}
				else {
					System.out.println("���� ��");
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\\uD559\uC0DD\uBC29\\LSH\\day02\\\uAC00\uC704.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uBC14\uC704");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ �����̱���");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				if (computer==0) {
					System.out.println("���� ��");
				} 
				else if(computer == 1){
					System.out.println("�����");

				}
				else {
					System.out.println("��ǻ�� ��");
				}
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\\uD559\uC0DD\uBC29\\LSH\\day02\\\uBC14\uC704.jpg"));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uBCF4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("���� �����̱���");
				Random r = new Random();
				
				int computer = r.nextInt(3);
				if (computer==0) {
					System.out.println("��ǻ�� ��");
				} 
				else if(computer == 1){
					System.out.println("���� ��");

				}
				else {
					System.out.println("�����");
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\\uD559\uC0DD\uBC29\\LSH\\day02\\\uBCF4.jpg"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		
				
		
		f.setVisible(true);

	}

}
