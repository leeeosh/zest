package 클래스;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class 카운터 {

	static int count = 0;	//버튼에서 실행하는데 count 변수가 오류가 떠서 main에서 빼서 선언을 하고 main에도 static이 있으니 얘도 붙여준다.
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		
		//프레임 부품
		JLabel result = new JLabel("0");//밑에서 써야하기에 아래에서 가져왔다.
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setForeground(Color.BLACK);
		f.setBackground(Color.WHITE);
		f.getContentPane().setForeground(Color.WHITE);
		f.setSize(505, 752);
		f.setTitle("나의 카운터");
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7901");
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setForeground(SystemColor.textHighlight);
		t1.setFont(new Font("굴림", Font.BOLD, 24));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC22B\uC7902");
		f.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setForeground(SystemColor.textHighlight);
		t2.setFont(new Font("굴림", Font.BOLD, 24));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\d\\Desktop\\\uCE74\uC6B4\uD130.PNG"));
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "+를 누르셨군요");
				//count++;
				//두 개의 숫자값을 가지고 와야한다.
				String s1 = t1.getText();
				String s2 = t2.getText();
				//scanner 사용했을 때를 제외한 나머지는 모두 string으로 오기에 int로 변환해주면 된다.
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int n3 = n1 + n2;
				//result에 결과값을 넣어줌
				result.setText(n3+"");
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 99));
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("0");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//count = 0;
				result.setText(0+""); // 이렇게 뒤에 "" 붙이면 string으로 변환이 가능하다. settext는 string을 나타내는 얘이니까 int형을 넣어버리면 안된다.
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 99));
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "-를 누르셨군요");
				//count--;
				//두 개의 숫자값을 가지고 와야한다.
				String s1 = t1.getText();
				String s2 = t2.getText();
				//scanner 사용했을 때를 제외한 나머지는 모두 string으로 오기에 int로 변환해주면 된다.
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int n3 = n1 - n2;
				//result에 결과값을 넣어줌
				result.setText(n3+"");
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 99));
		f.getContentPane().add(btnNewButton);
		
		result.setBackground(Color.ORANGE);
		result.setFont(new Font("돋움", Font.BOLD, 99));
		f.getContentPane().add(result);
		
		
		f.setVisible(true);
		
		
		
	}

}
