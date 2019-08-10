package 배열;

import javax.swing.JOptionPane;

public class 배열제어 {

	public static void main(String[] args) {
		int seat[][] = new int [3][10];
		while (true) {
			System.out.println("   ---------------------");
			System.out.print("    ");
			for (int i = 0; i < seat[0].length; i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n   ---------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " : ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + " ");
				}
				System.out.println("");
			}
			String x = JOptionPane.showInputDialog("예약할 행 입력");
			int a = Integer.parseInt(x);
			String y = JOptionPane.showInputDialog("예약할 열 입력");
			int b = Integer.parseInt(y);
			if(seat[a][b] != 1) {
				seat[a][b] = 1;
				JOptionPane.showMessageDialog(null,	 "예약 완료");
				
			}
			else {
				JOptionPane.showMessageDialog(null,	 "이미 예약된 좌석입니다.");
			}
			
			String s = JOptionPane.showInputDialog("종료시 1  입력");
			if(s.equals("1")) {
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				break;
			}
			
		}
		
		
		
	}

}
