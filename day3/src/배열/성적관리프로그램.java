package �迭;

import java.util.Scanner;

public class �����������α׷� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ���α׷�");
		int score[] = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"��° ���� �Է� :");
			score[i] = sc.nextInt();
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"��° �л��� ������ "+score[i]);
		}
		
		
	}

}
