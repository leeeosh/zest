package �ݺ���;


import java.util.Scanner;

public class fortest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;	
		while(true) {
			System.out.print("���� �Է�(����� 0 �Է�):");
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
