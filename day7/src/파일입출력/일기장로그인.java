package 파일입출력;

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

public class 일기장로그인 {
	private JTextField t1;
	private JTextField t2;
	public 일기장로그인() {
		JFrame f = new JFrame("나의 일기장");
		f.getContentPane().setBackground(new Color(255, 255, 153));
		f.setSize(411, 576);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tjsc2-202-06\\Desktop\\2.PNG"));
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID\uC785\uB825");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 13));
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 13));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PW\uC785\uB825");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 13));
		f.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 13));
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
					JOptionPane.showMessageDialog(f, "로그인 성공");
					일기장 diary = new 일기장();	//위에서 만든 일기장의 생성자가 자동으로 실행된다.
					
				}
				else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
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
		일기장로그인 name = new 일기장로그인();

	}

}
