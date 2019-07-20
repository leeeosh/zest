import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed = 1;
		while (true) {
			System.out.println("----------------");
			System.out.println("1.증속 |2.감속 |3.중지");
			System.out.println("----------------");
			System.out.print("선택 : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				speed++;
				if (speed > 3) {
					System.out.println("현재 최대 속도 3 입니다.");
					speed = 3;
				} else {
					System.out.println("현재 속도=" + speed);
				}
			} else if (sel == 2) {
				speed--;
				if (speed < 1) {
					System.out.println("현재 최소 속도 1입니다.");
					speed = 1;
				} else {
					System.out.println("현재 속도=" + speed);
				}
			} else {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
