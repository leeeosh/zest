package ������;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷���2 {
	
	int i = 1;
	public ���Ǳ׷���2() {
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel label = new JLabel();
		f.getContentPane().add(label);
		
		
		JButton b1 = new JButton("���� ������");
		JButton b2 = new JButton();
		
		ImageIcon icon2 = new ImageIcon("06.png");
		ImageIcon icon = new ImageIcon("07.png");
		b2.setIcon(icon);	//set icon �ϸ� �̹����� ������ �� �ִ�.
		label.setText("��ȿ�� �׸�");
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("��ư�� ��������.");
				
				if((i%2) == 1) {
					b2.setIcon(icon2);
					label.setText("������ �׸�");
					
					i++;
				}
				else {
					b2.setIcon(icon);
					label.setText("��ȿ�� �׸�");
					
					i--;
				}
				
				
			}
		});
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		
		
		JTextField t1 = new JTextField(10);	//���ڸ� �Է��� �� �ִ� â�� ����� ��ȣ �ȿ� ��ܾ� ���� ������ �Է��ϸ� â�� �ː��� ũ��� �����ȴ�.
		JTextField t2 = new JTextField(10);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		JLabel result = new JLabel("����� ���");
		f.getContentPane().add(result);
		JButton b3 = new JButton("���� ����� Ȯ�� ");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();	//�ؽ�Ʈ�� �޾Ƽ� �� ���� gettext �̿��Ѵ�.
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				result.setText(i1+i2+"");
			}
		});
		f.getContentPane().add(b3);
		
		
		
		f.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		���Ǳ׷���2 name = new ���Ǳ׷���2();

	}

}
