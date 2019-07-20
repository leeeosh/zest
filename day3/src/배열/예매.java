package 배열;

import java.util.Scanner;

public class 예매 {

	public static void main(String[] args) {
		int seat[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---좌석현황---");
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
		
		System.out.print("예매 인원수 :");
		int num = sc.nextInt();
		for(int i =0;i<num;i++) {
			System.out.print("예매할 좌석 입력 :");
			int book = sc.nextInt();
			seat[book] = 1;
		}
		
		
		
		System.out.println("---좌석현황---");
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
