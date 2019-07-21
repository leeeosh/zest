package 배열심화;

import javax.swing.JOptionPane;

public class 다이얼로그2 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "안녕하세요");
		String input = JOptionPane.showInputDialog("원하는 숫자를 입력하세요!");
		int n1 = Integer.parseInt(input);
		String input1 = JOptionPane.showInputDialog("원하는 숫자를 입력하세요!");
		int n2 = Integer.parseInt(input1);
		JOptionPane.showMessageDialog(null, "두 수의 합은 "+(n1+n2)+"입니다.");
		
		
		
		
		
	}

}
