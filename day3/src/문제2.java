import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed = 1;
		while (true) {
			System.out.println("----------------");
			System.out.println("1.���� |2.���� |3.����");
			System.out.println("----------------");
			System.out.print("���� : ");
			int sel = sc.nextInt();
			if (sel == 1) {
				speed++;
				if (speed > 3) {
					System.out.println("���� �ִ� �ӵ� 3 �Դϴ�.");
					speed = 3;
				} else {
					System.out.println("���� �ӵ�=" + speed);
				}
			} else if (sel == 2) {
				speed--;
				if (speed < 1) {
					System.out.println("���� �ּ� �ӵ� 1�Դϴ�.");
					speed = 1;
				} else {
					System.out.println("���� �ӵ�=" + speed);
				}
			} else {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}

}
