package 게임만들기;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();	//프레임을 만들기 위한 class 가져온 것
		f.setTitle("나의 첫 그래픽");		//제목을 설정하는 것
		f.setSize(500, 500);		//프레임의 크기를 만들기 위해 .setsize라는 기능 수행		
		
		JButton button = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가운데 버튼을 눌렀군요!");
				
				
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(Color.PINK);
		button.setFont(new Font("한컴 솔잎 B", Font.BOLD, 26));
		f.getContentPane().add(button, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("\uC704 \uBC84\uD2BC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("위에 있는 버튼을 눌렀군요");
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 26));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton button_1 = new JButton("\uC544\uB798 \uBC84\uD2BC");
		button_1.setBackground(Color.ORANGE);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("휴먼매직체", Font.PLAIN, 26));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		f.getContentPane().add(button_1, BorderLayout.EAST);
		
		JButton btnNewButton_1 = new JButton("\uC67C\uCABD \uBC84\uD2BC");
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("휴먼매직체", Font.PLAIN, 26));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uC544\uB798 \uBC84\uD2BC");
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("휴먼매직체", Font.PLAIN, 26));
		f.getContentPane().add(btnNewButton_2, BorderLayout.SOUTH);
		
		
		
		
		f.setVisible(true); 		//만든 프레임을 보이게 할지 안보이게 숨길지 설정하는 것, setvisible이 위에 설정보다 아래에 있어야한다.
									//windows builder를 깔아서 얘를 이용하면 훨씬 쉽게 창을 만들수 있다. 드래그 해서 만들 수 있다. class에 open with 누르고 window builder 선택한다.
		
		
		
		
	}

}
