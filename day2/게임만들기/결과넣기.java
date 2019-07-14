package 게임만들기;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 결과넣기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();	
		f.setTitle("나의  그래픽");		
		f.setSize(500, 500);		
		
		JButton top = new JButton("\uC704 \uBC84\uD2BC");
		JButton sub = new JButton("\uC544\uB798 \uBC84\uD2BC");
		JButton middle = new JButton("\uAC00\uC6B4\uB370 \uBC84\uD2BC");
		top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("top을 누르셨군요!");
				f.setTitle("top을 누르셨군요!");
				top.setText("top을 누르셨군요!");
			}
		});
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		middle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setTitle("middle을 누르셨군요!");
				sub.setText("middle을 누르셨군요!");
			}
		});
		f.getContentPane().add(middle, BorderLayout.CENTER);
		
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setTitle("sub를 누르셨군요!");
				middle.setText("sub를 누르셨군요!");
			}
		});
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
