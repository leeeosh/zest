package �迭;

import javax.swing.JOptionPane;

public class ������ {

	public static void main(String[] args) {
		String i = JOptionPane.showInputDialog("������ �ܼ� �Է�");
		int num = Integer.parseInt(i);
		
		for (int j = 1; j <= 9; j++) {
			JOptionPane.showMessageDialog(null, num+" * "+j+" = "+(num*j));
		}
	}

}
