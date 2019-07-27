package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Mygrapic {

	public Mygrapic() {
		JFrame f = new JFrame("나의 그래픽");	//JFrame의 여러 생성자 중 원하는 생성자 선택한 것
		f.setSize(1000, 1000);
		
		FlowLayout flow = new FlowLayout(); //얘는 가운데로 계속 올리는게 아니라 순서대로 올려준다. 기본 설정을 가운데로 계속 올리는 것 대신 옆으로 추가하는 것으로 변경한 것
		f.setLayout(flow);
		
		JButton b1 = new JButton("나는 버튼");
		f.add(b1); // add라는 것은 frame에 버튼을 올려주는 역할을 수행한다. 올려주는 add는 기본적으로 계속 가운데에 올리기에 반복해서 사용하면 그대로 덮어쓴다.
		
		JButton b2 = new JButton("나도 버튼");
		f.add(b2);
		
		ImageIcon icon2 = new ImageIcon("06.png");
		
		JButton b3 = new JButton(icon2);
		f.add(b3);
		
		ImageIcon icon = new ImageIcon("005.png"); //이미지를 넣기 위해 imageicon이라는 class를 가져온다.
		
		JButton b4 = new JButton(icon);	//이미지를 버튼에 넣기 위해 icon을 넣는다.
		f.add(b4);

		
		
		
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Mygrapic me = new Mygrapic();	//이렇게 같은 이름으로 선언하면 위에 생성자가 생기는데 이렇게 만들어야 static으로 만들어지지 않아서 메모리를 많이 잡아먹지 않는다.
										//static은 계속 실행된다고 생각하면 되기에 메모리를 많이 잡아먹는다.
				

	}

}
