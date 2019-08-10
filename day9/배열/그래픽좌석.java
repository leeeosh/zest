package 배열;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 그래픽좌석 extends JFrame{

	public 그래픽좌석() {
	
		setTitle("200좌석 극장 예매");
		setSize(600, 360);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		Random r = new Random();
		Color[] color = {Color.yellow,Color.pink};
		
		
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i+"");	//버튼 형식의 배열을 만들고 각각의 배열에 주소값을 넣어줌으로써 총 200개의 버튼을 만든다.
			int index = r.nextInt(2);
			buttons[i].setBackground(color[index]);
			getContentPane().add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("예약 누름");
					String data = e.getActionCommand();	//누른 버튼의 번호를 출력한다.
					System.out.println(data);
					if(!data.equals("예약")) {
						int data2 = Integer.parseInt(data);
						buttons[data2].setText("예약");
						buttons[data2].setEnabled(false);// 입력이 들어오면 비활성화 시킨다.
						
					}
					
				}
			});
		}
		
		
		
		
		
		
		
		
		
		
		setVisible(true);
		
	
	
	}
	public static void main(String[] args) {
		그래픽좌석 name = new 그래픽좌석();
		
		
		
		
	}

}
