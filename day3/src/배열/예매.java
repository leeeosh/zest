package �迭;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		int seat[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---�¼���Ȳ---");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		for (int i = 0; i < seat.length; i++) {
			System.out.print("- ");
		}
		System.out.println("");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println("");
		
		System.out.print("���� �ο��� :");
		int num = sc.nextInt();
		for(int i =0;i<num;i++) {
			System.out.print("������ �¼� �Է� :");
			int book = sc.nextInt();
			seat[book] = 1;
		}
		
		
		
		System.out.println("---�¼���Ȳ---");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		for (int i = 0; i < seat.length; i++) {
			System.out.print("- ");
		}
		System.out.println("");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println("");
		
		
		
		
	}

}
