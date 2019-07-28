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

public class µþ¿ëµ· {
	
	int countlee = 0;
	int countkim = 0;
	
	public µþ¿ëµ·() {
		JFrame f = new JFrame();
		f.setSize(300, 454);
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
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				d1.name = input1.getText();
				String i = input2.getText();
				d1.height = Integer.parseInt(i);				
				
				Fam.wallet = Fam.wallet - 1000;
				mon.setText(Fam.wallet+"");
				
				input1.setText("");
				input2.setText("");
				
				o.showMessageDialog(f, d1 + "»ì ÀÔ´Ï´Ù.");
				
				if(d1.name.equals("lee")) {
					countlee++;					
				}
				else {
					countkim++;
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
		JButton show = new JButton();
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				if(s1.equals("lee")) {
					JOptionPane.showMessageDialog(null, d1.name+"Àº "+countlee+"È¸");
					
				}
				else if(s1.equals("kim")) {
					JOptionPane.showMessageDialog(null, d2.name+"Àº "+countkim+"È¸");
				}
				else {
					JOptionPane.showMessageDialog(null, "¾ø´Â ÀÌ¸§ÀÔ´Ï´Ù.");
				}
			}
		});
		f.getContentPane().add(show);
		show.setText("È½¼ö °Ë»ö");
		
		
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		µþ¿ëµ· name = new µþ¿ëµ·();
		
		
		
	}

}
