package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽3 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(245, 500);
		f.setTitle("오늘의 영화");
		FlowLayout layor = new FlowLayout();
		f.getContentPane().setLayout(layor);
		
		ImageIcon icon = new ImageIcon("1.png");
		ImageIcon icon2 = new ImageIcon("2.png");
		ImageIcon icon3 = new ImageIcon("3.png");
		ImageIcon grap = new ImageIcon("11.png");
		
		JLabel label = new JLabel();
		f.getContentPane().add(label);
		label.setIcon(grap);
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setIcon(icon);
				f.setTitle("어스");
			}
		});
		b1.setText("어스");
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icon2);
				f.setTitle("돈");
				
			}
		});
		b2.setText("돈");
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icon3);
				f.setTitle("캡틴 마블");
			}
		});
		b3.setText("캡틴 마블");
		f.getContentPane().add(b3);
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
		
	}

}
