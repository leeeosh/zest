package �迭��ȭ;

import java.util.Scanner;

public class ��ռ��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("�����Է�>");
			k = sc.nextInt();
			sum = sum + k;
		}
		
		System.out.println("��ռ��� :"+(sum/5));
		
		
	}

}
