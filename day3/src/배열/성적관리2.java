package �迭;

import java.util.Scanner;

public class ��������2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"��° �л� ���� :");
			score[i] = sc.nextInt(); 
		}
		score[2] = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"��° �л��� ������ "+score[i]);
		}
		
	}

}
