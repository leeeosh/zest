package Dialog;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "안녕하세요");
		String s = JOptionPane.showInputDialog("나이 입력해주세요");
		int age = Integer.parseInt(s);
		JOptionPane.showMessageDialog(null, s);
		
	}

}
