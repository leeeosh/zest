package ������;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Mygrapic {

	public Mygrapic() {
		JFrame f = new JFrame("���� �׷���");	//JFrame�� ���� ������ �� ���ϴ� ������ ������ ��
		f.setSize(1000, 1000);
		
		FlowLayout flow = new FlowLayout(); //��� ����� ��� �ø��°� �ƴ϶� ������� �÷��ش�. �⺻ ������ ����� ��� �ø��� �� ��� ������ �߰��ϴ� ������ ������ ��
		f.setLayout(flow);
		
		JButton b1 = new JButton("���� ��ư");
		f.add(b1); // add��� ���� frame�� ��ư�� �÷��ִ� ������ �����Ѵ�. �÷��ִ� add�� �⺻������ ��� ����� �ø��⿡ �ݺ��ؼ� ����ϸ� �״�� �����.
		
		JButton b2 = new JButton("���� ��ư");
		f.add(b2);
		
		ImageIcon icon2 = new ImageIcon("06.png");
		
		JButton b3 = new JButton(icon2);
		f.add(b3);
		
		ImageIcon icon = new ImageIcon("005.png"); //�̹����� �ֱ� ���� imageicon�̶�� class�� �����´�.
		
		JButton b4 = new JButton(icon);	//�̹����� ��ư�� �ֱ� ���� icon�� �ִ´�.
		f.add(b4);

		
		
		
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Mygrapic me = new Mygrapic();	//�̷��� ���� �̸����� �����ϸ� ���� �����ڰ� ����µ� �̷��� ������ static���� ��������� �ʾƼ� �޸𸮸� ���� ��Ƹ��� �ʴ´�.
										//static�� ��� ����ȴٰ� �����ϸ� �Ǳ⿡ �޸𸮸� ���� ��ƸԴ´�.
				

	}

}
