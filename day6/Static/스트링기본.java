package Static;

import javax.swing.JOptionPane;

public class 스트링기본 {

	public static void main(String[] args) {
		
		int count1 = 0;
		int count2 = 0;
		
		while (true) {
			String s1 = JOptionPane.showInputDialog("이름 입력");
			String s2 = JOptionPane.showInputDialog("이름 입력");
			
			if (s1.equals(s2)) {
				count1++;
			} else {
				count2++;
				
			}
			JOptionPane.showMessageDialog(null, "동일한 횟수 " + count1 + " 다른 횟수 " + count2);
			
		}
		

	}

}
