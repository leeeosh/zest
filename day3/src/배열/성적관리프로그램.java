package 배열;

import java.util.Scanner;

public class 성적관리프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 관리 프로그램");
		int score[] = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"번째 성적 입력 :");
			score[i] = sc.nextInt();
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번째 학생의 성적은 "+score[i]);
		}
		
		
	}

}
