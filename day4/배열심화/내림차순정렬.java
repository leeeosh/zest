package �迭��ȭ;

import java.util.Scanner;

public class ������������ {

	public static void main(String[] args) {

		int arr[] = new int[5];
		int num[] = new int[5];
		int max = 0;
		int index = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("���� �Է�>");
			arr[i] = sc.nextInt();
		}
		
		for (int x = 0; x < num.length; x++) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
					index = i;
				}
			}
			System.out.println(max);
			arr[index] = -1;
			max = 0;
			index = 0;
			
		}
		
		
		
		
		
		
		
	}

}
