import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mon = 0;
		int sel = 0;
		while (true) {
			System.out.println("-----------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("-----------------");
			System.out.print("선택>");
			sel = sc.nextInt();

			if (sel == 1) {
				System.out.print("예금액>");
				int plu = sc.nextInt();
				mon = mon + plu;
			} else if (sel == 2) {
				System.out.print("출금액>");
				int min = sc.nextInt();
				mon = mon - min;
				if(mon <0) {
					System.out.println("잔고보다 출금액이 많습니다.");
				}
				
			} else if (sel == 3) {
				System.out.print("잔고>" + mon);
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
