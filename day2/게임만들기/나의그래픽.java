package ���Ӹ����;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷��� {

	public static void main(String[] args) {
		JFrame f = new JFrame();	//�������� ����� ���� class ������ ��
		f.setTitle("���� ù �׷���");		//������ �����ϴ� ��
		f.setSize(500, 500);		//�������� ũ�⸦ ����� ���� .setsize��� ��� ����		
		
		JButton button = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��� ��ư�� ��������!");
				
				
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(Color.PINK);
		button.setFont(new Font("���� ���� B", Font.BOLD, 26));
		f.getContentPane().add(button, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("\uC704 \uBC84\uD2BC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("���� �ִ� ��ư�� ��������");
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("�޸ո���ü", Font.PLAIN, 26));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton button_1 = new JButton("\uC544\uB798 \uBC84\uD2BC");
		button_1.setBackground(Color.ORANGE);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("�޸ո���ü", Font.PLAIN, 26));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		f.getContentPane().add(button_1, BorderLayout.EAST);
		
		JButton btnNewButton_1 = new JButton("\uC67C\uCABD \uBC84\uD2BC");
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("�޸ո���ü", Font.PLAIN, 26));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uC544\uB798 \uBC84\uD2BC");
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("�޸ո���ü", Font.PLAIN, 26));
		f.getContentPane().add(btnNewButton_2, BorderLayout.SOUTH);
		
		
		
		
		f.setVisible(true); 		//���� �������� ���̰� ���� �Ⱥ��̰� ������ �����ϴ� ��, setvisible�� ���� �������� �Ʒ��� �־���Ѵ�.
									//windows builder�� ��Ƽ� �긦 �̿��ϸ� �ξ� ���� â�� ����� �ִ�. �巡�� �ؼ� ���� �� �ִ�. class�� open with ������ window builder �����Ѵ�.
		
		
		
		
	}

}
