package 배열심화;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score[] = null;
		int num = 0;
		
		
		while (true) {
			System.out.println("--------------------------");
			System.out.println("1.학생수  2.점수입력  3.정렬  4.분석  5.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			
			int sel = sc.nextInt();
			
			
			if(sel == 1) {
				System.out.print("학생수>");
				num = sc.nextInt();
				score = new int[num];
			}
			else if(sel == 2) {					
				for (int i = 0; i < score.length; i++) {
					System.out.print("점수입력>");
					score[i] = sc.nextInt();
				}
			}
			else if(sel == 3) {
				System.out.println("정렬");
				for (int j = 0; j < score.length; j++) {
					for (int i = 0; i < (score.length - 1); i++) {
						if (score[i + 1] < score[i]) {
							int temp = score[i + 1];
							score[i + 1] = score[i];
							score[i] = temp;
						}
					} 
				}
				System.out.println("1.오름차순 정렬  2.내림차순 정렬");
				
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
				System.out.println("최고 점수 :"+max);
				System.out.println("평균 점수 :"+(sum/num));
				
			}
			else if(sel == 5) {
				System.out.println("종료합니다.");
				num = 0;
				break;
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}

}
