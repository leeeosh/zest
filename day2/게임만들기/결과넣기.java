package ���Ӹ����;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ����ֱ� {

	public static void main(String[] args) {
		JFrame f = new JFrame();	
		f.setTitle("����  �׷���");		
		f.setSize(500, 500);		
		
		JButton top = new JButton("\uC704 \uBC84\uD2BC");
		JButton sub = new JButton("\uC544\uB798 \uBC84\uD2BC");
		JButton middle = new JButton("\uAC00\uC6B4\uB370 \uBC84\uD2BC");
		top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("top�� �����̱���!");
				f.setTitle("top�� �����̱���!");
				top.setText("top�� �����̱���!");
			}
		});
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		middle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setTitle("middle�� �����̱���!");
				sub.setText("middle�� �����̱���!");
			}
		});
		f.getContentPane().add(middle, BorderLayout.CENTER);
		
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setTitle("sub�� �����̱���!");
				middle.setText("sub�� �����̱���!");
			}
		});
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
