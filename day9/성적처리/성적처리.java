package 성적처리;

import javax.swing.JOptionPane;

public class 성적처리 {
	public static void main(String[] args) {
		int sum = 0;
		int sco = 0;
		
		String i1 = JOptionPane.showInputDialog("이름 입력");
		String i2 = JOptionPane.showInputDialog("소속 입력");
		for (int j = 0; j < 3; j++) {
			String i3 = JOptionPane.showInputDialog("점수 입력");
			sco = Integer.parseInt(i3);
			sum = sum + sco;
		}
		
		
		
		명단 lay = new 명단(i1, i2, sco);
		JOptionPane.showMessageDialog(null, lay);
		JOptionPane.showMessageDialog(null, "총점 : "+sum+" 평균 : "+(sum/3));
		
		
		
		
		
		
		
		
	}
	
}
