package 반복문;


import java.util.Scanner;

public class fortest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;	
		while(true) {
			System.out.print("숫자 입력(종료시 0 입력):");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("the end");
				break;
			}
			
			sum = sum + num;
			System.out.println("result:" + sum);
			
			
			
		}
		
		
		
	}

}
