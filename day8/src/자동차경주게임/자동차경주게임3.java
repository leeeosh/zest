package 자동차경주게임;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차경주게임3 extends JFrame {
	
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
			add(label);	//jframe에 라벨을 올려줘야 하는데 add가 사용되는 class와 jframe의 위치가 다르기 때문에
		}
		Random r = new Random();
		
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				x = x + r.nextInt(10);
				label.setBounds(x, y, 100, 100);	//앞에 두개가 50,50이라는 위치를 나타내는 것이고 뒤에 100과 100은 라벨의 크기를 나타내는 것이다.
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}


	public 자동차경주게임3() {	//jframe으로 부터 상속 받았기에 점 찍지 않고 바로 메소드에 접근해 사용가능하다.
		int x=50;
		setTitle("자동차 경주게임");
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
		자동차경주게임3 name = new 자동차경주게임3();
		
		
	}

}
