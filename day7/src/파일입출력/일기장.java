package ÆÄÀÏÀÔÃâ·Â;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ÀÏ±âÀå {
	private JTextField t1;
	private JTextField t2;
	public ÀÏ±âÀå() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 204));
		f.setSize(362, 500);
		f.setTitle("ÀÏ±âÀå");
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("\uC77C\uAE30\uC7A5 \uC791\uC131\uB0A0\uC9DC :");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC77C\uAE30\uC7A5 \uC791\uC131 \uC81C\uBAA9 :");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC77C\uAE30\uC7A5 \uC791\uC131 \uB0B4\uC6A9");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		f.getContentPane().add(lblNewLabel_2);
		
		JTextArea t3 = new JTextArea();
		t3.setRows(10);
		t3.setColumns(30);
		f.getContentPane().add(t3);
		
		JButton b = new JButton("\uD30C\uC77C\uC5D0 \uC800\uC7A5\uD558\uAE30");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String date = t1.getText();
				String title = t2.getText();
				String tex = t3.getText();
				
				try {
					FileWriter file = new FileWriter(date+".txt");
					file.write(date+"\n");
					file.write(title+"\n");
					file.write(tex+"\n");
					file.close();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				
				
			}
		});
		b.setBackground(Color.WHITE);
		f.getContentPane().add(b);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		ÀÏ±âÀå name = new ÀÏ±âÀå();
		

	}

}
