package 배열심화;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "환영합니다."); /*앞에 null은 내부에 또다른 창을 띄울 것인지 묻는 것이다. 
															정렬 명령어처럼 이렇게 자주 사용하는 부품은 new 없이 바로 사용 가능하다.*/
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요"); //창에서 입력한 문자열이 name이라는 변수에 들어가게 되는 시스템!
		JOptionPane.showMessageDialog(null, "당신의 이름은 "+name);
		
		String input = JOptionPane.showInputDialog("나이 입력"); /*scanner를 사용하면 자동으로 int로 변경해줘서 편한데 얘는 아쉽게도 그게 불가능하다. 
												이렇게 입력 받는 것은 전부 문자열로 들어온다. 따라서 int로 바꿔주는 얘 사용해야한다.*/
		int age = Integer.parseInt(input); // 이것도 많이 사용하는 부품이기에 new 없이 바로 사용하고 앞에 대문자로 적는다.
		JOptionPane.showMessageDialog(null, "당신의 나이는 "+age);	
		
																//이렇게 입력하고 하는 그래픽이 다이얼로그이다.
		
		
		
	}

}
