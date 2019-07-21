package 배열심화;

import java.util.Scanner;

public class 평균성적 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("성적입력>");
			k = sc.nextInt();
			sum = sum + k;
		}
		
		System.out.println("평균성적 :"+(sum/5));
		
		
	}

}
