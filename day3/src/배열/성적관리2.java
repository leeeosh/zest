package 硅凯;

import java.util.Scanner;

public class 己利包府2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"锅掳 切积 己利 :");
			score[i] = sc.nextInt(); 
		}
		score[2] = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"锅掳 切积狼 己利篮 "+score[i]);
		}
		
	}

}
