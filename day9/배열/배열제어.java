package �迭;

import javax.swing.JOptionPane;

public class �迭���� {

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
			String x = JOptionPane.showInputDialog("������ �� �Է�");
			int a = Integer.parseInt(x);
			String y = JOptionPane.showInputDialog("������ �� �Է�");
			int b = Integer.parseInt(y);
			if(seat[a][b] != 1) {
				seat[a][b] = 1;
				JOptionPane.showMessageDialog(null,	 "���� �Ϸ�");
				
			}
			else {
				JOptionPane.showMessageDialog(null,	 "�̹� ����� �¼��Դϴ�.");
			}
			
			String s = JOptionPane.showInputDialog("����� 1  �Է�");
			if(s.equals("1")) {
				JOptionPane.showMessageDialog(null, "���α׷� ����");
				break;
			}
			
		}
		
		
		
	}

}
