package �迭;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class �׷����¼� extends JFrame{

	public �׷����¼�() {
	
		setTitle("200�¼� ���� ����");
		setSize(600, 360);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		Random r = new Random();
		Color[] color = {Color.yellow,Color.pink};
		
		
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i+"");	//��ư ������ �迭�� ����� ������ �迭�� �ּҰ��� �־������ν� �� 200���� ��ư�� �����.
			int index = r.nextInt(2);
			buttons[i].setBackground(color[index]);
			getContentPane().add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("���� ����");
					String data = e.getActionCommand();	//���� ��ư�� ��ȣ�� ����Ѵ�.
					System.out.println(data);
					if(!data.equals("����")) {
						int data2 = Integer.parseInt(data);
						buttons[data2].setText("����");
						buttons[data2].setEnabled(false);// �Է��� ������ ��Ȱ��ȭ ��Ų��.
						
					}
					
				}
			});
		}
		
		
		
		
		
		
		
		
		
		
		setVisible(true);
		
	
	
	}
	public static void main(String[] args) {
		�׷����¼� name = new �׷����¼�();
		
		
		
		
	}

}
