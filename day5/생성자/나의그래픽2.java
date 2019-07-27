package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽2 {
	
	int i = 1;
	public 나의그래픽2() {
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel label = new JLabel();
		f.getContentPane().add(label);
		
		
		JButton b1 = new JButton("나를 눌러요");
		JButton b2 = new JButton();
		
		ImageIcon icon2 = new ImageIcon("06.png");
		ImageIcon icon = new ImageIcon("07.png");
		b2.setIcon(icon);	//set icon 하면 이미지를 지정할 수 있다.
		label.setText("한효주 그림");
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼을 눌렀군요.");
				
				if((i%2) == 1) {
					b2.setIcon(icon2);
					label.setText("아이유 그림");
					
					i++;
				}
				else {
					b2.setIcon(icon);
					label.setText("한효주 그림");
					
					i--;
				}
				
				
			}
		});
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		
		
		JTextField t1 = new JTextField(10);	//글자를 입력할 수 있는 창을 만들고 괄호 안에 몇단어 정도 쓸건지 입력하면 창이 알맍은 크기로 형성된다.
		JTextField t2 = new JTextField(10);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		JLabel result = new JLabel("결과값 출력");
		f.getContentPane().add(result);
		JButton b3 = new JButton("더한 결과값 확인 ");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();	//텍스트를 받아서 올 때는 gettext 이용한다.
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
		나의그래픽2 name = new 나의그래픽2();

	}

}
