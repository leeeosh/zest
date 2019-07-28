package Static;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class µþ¿ëµ·2 {
	
	
	public µþ¿ëµ·2() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setBackground(Color.ORANGE);
		f.setSize(279, 514);
		f.setTitle("µþ ¿ëµ· ±×·¡ÇÈ");
		
		Fam d1 = new Fam(null, 0);
		Fam d2 = new Fam(null, 0);
		JOptionPane o = new JOptionPane();
		
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel t1 = new JLabel();
		t1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		JTextField input1 = new JTextField(10);
		input1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		JTextField input2 = new JTextField(10);
		input2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		JLabel mon = new JLabel();
		t1.setText("µþ ÀÌ¸§:");
		
				
		JButton b = new JButton();
		JTextArea list = new JTextArea(10,10);
		
		
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = input1.getText();
				d1.name = a;
				String i = input2.getText();
				d1.height = Integer.parseInt(i);				
				
				Fam.wallet = Fam.wallet - 1000;
				mon.setText(Fam.wallet+"");
				
				input1.setText("");
				input2.setText("");
				
				list.append(d1+"\n");
				
				try {
					FileWriter file = new FileWriter("c:/temp/" + a + ".txt");
					file.write(d1+"\n");
					file.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				
				
							
				
			}
		});
		b.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		b.setText("¾Æºü ¿ëµ·ÁÖ¼¼¿ä");
		
		f.getContentPane().add(t1);
		f.getContentPane().add(input1);
		JLabel t2 = new JLabel();
		t2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		t2.setText("µþ ³ªÀÌ:");
		f.getContentPane().add(t2);
		f.getContentPane().add(input2);
		f.getContentPane().add(b);
		mon.setFont(new Font("±¼¸²", Font.PLAIN, 67));
		mon.setText(Fam.wallet+"");
		f.getContentPane().add(mon);
		list.setFont(new Font("Monospaced", Font.PLAIN, 18));
		f.getContentPane().add(list);
		
		
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		µþ¿ëµ·2 name = new µþ¿ëµ·2();
		
		
		
	}

}
