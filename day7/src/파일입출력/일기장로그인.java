package ���������;

import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;import javax.swing.JLayer;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �ϱ���α��� {
	private JTextField t1;
	private JTextField t2;
	public �ϱ���α���() {
		JFrame f = new JFrame("���� �ϱ���");
		f.getContentPane().setBackground(new Color(255, 255, 153));
		f.setSize(411, 576);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-06\\Desktop\\2.PNG"));
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID\uC785\uB825");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 13));
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("����", Font.PLAIN, 13));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PW\uC785\uB825");
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 13));
		f.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setFont(new Font("����", Font.PLAIN, 13));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				String id = "lee";
				String pw = "1234";
				
				if(id.equals(s1)&&pw.equals(s2)) {
					JOptionPane.showMessageDialog(f, "�α��� ����");
					�ϱ��� diary = new �ϱ���();	//������ ���� �ϱ����� �����ڰ� �ڵ����� ����ȴ�.
					
				}
				else {
					JOptionPane.showMessageDialog(f, "�α��� ����");
					t1.setText("");
					t2.setText("");
					
				}
				
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.BLACK);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		�ϱ���α��� name = new �ϱ���α���();

	}

}
