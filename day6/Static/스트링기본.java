package Static;

import javax.swing.JOptionPane;

public class ��Ʈ���⺻ {

	public static void main(String[] args) {
		
		int count1 = 0;
		int count2 = 0;
		
		while (true) {
			String s1 = JOptionPane.showInputDialog("�̸� �Է�");
			String s2 = JOptionPane.showInputDialog("�̸� �Է�");
			
			if (s1.equals(s2)) {
				count1++;
			} else {
				count2++;
				
			}
			JOptionPane.showMessageDialog(null, "������ Ƚ�� " + count1 + " �ٸ� Ƚ�� " + count2);
			
		}
		

	}

}
