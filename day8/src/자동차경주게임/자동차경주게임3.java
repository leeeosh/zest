package �ڵ������ְ���;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �ڵ������ְ���3 extends JFrame {
	
	public class carThread extends Thread {
		int x, y;
		ImageIcon icon;
		JLabel label;
		
		
		public carThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			label = new JLabel();
			icon = new ImageIcon(file);
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);	//jframe�� ���� �÷���� �ϴµ� add�� ���Ǵ� class�� jframe�� ��ġ�� �ٸ��� ������
		}
		Random r = new Random();
		
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				x = x + r.nextInt(10);
				label.setBounds(x, y, 100, 100);	//�տ� �ΰ��� 50,50�̶�� ��ġ�� ��Ÿ���� ���̰� �ڿ� 100�� 100�� ���� ũ�⸦ ��Ÿ���� ���̴�.
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}


	public �ڵ������ְ���3() {	//jframe���� ���� ��� �޾ұ⿡ �� ���� �ʰ� �ٷ� �޼ҵ忡 ������ ��밡���ϴ�.
		int x=50;
		setTitle("�ڵ��� ���ְ���");
		setSize(600, 200);
		
		carThread c1 = new carThread("car1.gif", 100, 0);
		carThread c2 = new carThread("car2.gif", 100, 50);
		carThread c3 = new carThread("car3.gif", 100, 100);
		c1.start();
		c2.start();
		c3.start();
		
		
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		�ڵ������ְ���3 name = new �ڵ������ְ���3();
		
		
	}

}
