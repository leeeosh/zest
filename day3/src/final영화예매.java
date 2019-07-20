import java.util.Scanner;

public class final영화예매 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seat[][] = new int[2][10];
		int num = 0;
		int sum = 0;

		System.out.println("  영화예매 프로그램 입니다.");
		while (true) {
			System.out.println("  -------좌석현황---------");
			System.out.print("    ");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.print("    ");
			for (int i = 0; i < 10; i++) {
				System.out.print("- ");
			}
			System.out.println("");
			
			for (int row = 0; row < 2; row++) {
				System.out.print("열"+row+"  ");
				for (int col = 0; col < 10; col++) {
					System.out.print(seat[row][col] + " ");
				}
				System.out.println("");
				
			}
			for (int i = 0; i < 10; i++) {
				System.out.print("- ");
			}
			System.out.println("");

			System.out.print("예매 인원수를 입력하세요 :");
			num = sc.nextInt();
			sum = sum + num;
			

			for (int i = 0; i < num; i++) {
				System.out.print("좌석의 행을 선택하세요 :");
				int row = sc.nextInt();
				System.out.print("좌석의 열을 선택하세요 :");
				int col = sc.nextInt();
				System.out.println("");
				
				if (seat[row][col] == 1) {
					System.out.println("이미 예약된 좌석입니다. 다시 선택해주세요");
					i--;
				} else {
					seat[row][col] = 1;
				}
			}

			System.out.print("계속 예매하시려면 0을 종료하시려면 1을 눌러 주세요 :");
			int check = sc.nextInt();
			if (check == 1) {
				System.out.println("  -------좌석현황---------");
				System.out.print("    ");
				for (int i = 0; i < 10; i++) {
					System.out.print(i + " ");
				}
				System.out.println("");
				System.out.print("    ");
				for (int i = 0; i < 10; i++) {
					System.out.print("- ");
				}
				System.out.println("");
				
				for (int row = 0; row < 2; row++) {
					System.out.print("열"+row+"  ");
					for (int col = 0; col < 10; col++) {
						System.out.print(seat[row][col] + " ");
					}
					System.out.println("");
					
				}
				for (int i = 0; i < 10; i++) {
					System.out.print("- ");
				}
				System.out.println("");
				System.out.println(sum + "분의 예매가 완료 됬습니다.\n총 금액은 " + (num * 8000) + "원 입니다.");
				break;
			}
			

		}
	}

}
