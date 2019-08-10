package 배열;

import javax.swing.JOptionPane;

public class 구구단 {

	public static void main(String[] args) {
		String i = JOptionPane.showInputDialog("구구단 단수 입력");
		int num = Integer.parseInt(i);
		
		for (int j = 1; j <= 9; j++) {
			JOptionPane.showMessageDialog(null, num+" * "+j+" = "+(num*j));
		}
	}

}
