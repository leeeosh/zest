package Static;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���뵷 {
	
	int countlee = 0;
	int countkim = 0;
	
	public ���뵷() {
		JFrame f = new JFrame();
		f.setSize(300, 454);
		f.setTitle("�� �뵷 �׷���");
		
		
		Fam d1 = new Fam(null, 0);
		Fam d2 = new Fam(null, 0);
		JOptionPane o = new JOptionPane();
		
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel t1 = new JLabel();
		t1.setFont(new Font("����", Font.PLAIN, 18));
		JTextField input1 = new JTextField(10);
		input1.setFont(new Font("����", Font.PLAIN, 18));
		JTextField input2 = new JTextField(10);
		input2.setFont(new Font("����", Font.PLAIN, 18));
		JLabel mon = new JLabel();
		t1.setText("�� �̸�:");
		
				
		JButton b = new JButton();
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				d1.name = input1.getText();
				String i = input2.getText();
				d1.height = Integer.parseInt(i);				
				
				Fam.wallet = Fam.wallet - 1000;
				mon.setText(Fam.wallet+"");
				
				input1.setText("");
				input2.setText("");
				
				o.showMessageDialog(f, d1 + "�� �Դϴ�.");
				
				if(d1.name.equals("lee")) {
					countlee++;					
				}
				else {
					countkim++;
				}
				
			}
		});
		b.setFont(new Font("����", Font.PLAIN, 18));
		b.setText("�ƺ� �뵷�ּ���");
		
		f.getContentPane().add(t1);
		f.getContentPane().add(input1);
		JLabel t2 = new JLabel();
		t2.setFont(new Font("����", Font.PLAIN, 18));
		t2.setText("�� ����:");
		f.getContentPane().add(t2);
		f.getContentPane().add(input2);
		f.getContentPane().add(b);
		mon.setFont(new Font("����", Font.PLAIN, 67));
		mon.setText(Fam.wallet+"");
		f.getContentPane().add(mon);
		JButton show = new JButton();
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				if(s1.equals("lee")) {
					JOptionPane.showMessageDialog(null, d1.name+"�� "+countlee+"ȸ");
					
				}
				else if(s1.equals("kim")) {
					JOptionPane.showMessageDialog(null, d2.name+"�� "+countkim+"ȸ");
				}
				else {
					JOptionPane.showMessageDialog(null, "���� �̸��Դϴ�.");
				}
			}
		});
		f.getContentPane().add(show);
		show.setText("Ƚ�� �˻�");
		
		
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		���뵷 name = new ���뵷();
		
		
		
	}

}
