package �迭��ȭ;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score[] = null;
		int num = 0;
		
		
		while (true) {
			System.out.println("--------------------------");
			System.out.println("1.�л���  2.�����Է�  3.����  4.�м�  5.����");
			System.out.println("--------------------------");
			System.out.print("����>");
			
			int sel = sc.nextInt();
			
			
			if(sel == 1) {
				System.out.print("�л���>");
				num = sc.nextInt();
				score = new int[num];
			}
			else if(sel == 2) {					
				for (int i = 0; i < score.length; i++) {
					System.out.print("�����Է�>");
					score[i] = sc.nextInt();
				}
			}
			else if(sel == 3) {
				System.out.println("����");
				for (int j = 0; j < score.length; j++) {
					for (int i = 0; i < (score.length - 1); i++) {
						if (score[i + 1] < score[i]) {
							int temp = score[i + 1];
							score[i + 1] = score[i];
							score[i] = temp;
						}
					} 
				}
				System.out.println("1.�������� ����  2.�������� ����");
				
				int sel2 = sc.nextInt();
				if(sel2 == 1) {
					for (int i = 0; i < score.length; i++) {
						System.out.print(score[(score.length-1-i)]+",");
					}
					System.out.println("");
				}
				else {
					for (int i = 0; i < score.length; i++) {
						System.out.print(score[i]+",");
					}
					System.out.println("");
				}
				
				
				
			}
			else if(sel == 4) {
				int max = score[0];
				int sum = 0;
				for (int i = 0; i < score.length; i++) {
					if(max<score[i]) {
						max = score[i];
					}
					sum = sum + score[i];
				}
				System.out.println("�ְ� ���� :"+max);
				System.out.println("��� ���� :"+(sum/num));
				
			}
			else if(sel == 5) {
				System.out.println("�����մϴ�.");
				num = 0;
				break;
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}

}
