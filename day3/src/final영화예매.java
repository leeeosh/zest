import java.util.Scanner;

public class final��ȭ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seat[][] = new int[2][10];
		int num = 0;
		int sum = 0;

		System.out.println("  ��ȭ���� ���α׷� �Դϴ�.");
		while (true) {
			System.out.println("  -------�¼���Ȳ---------");
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
				System.out.print("��"+row+"  ");
				for (int col = 0; col < 10; col++) {
					System.out.print(seat[row][col] + " ");
				}
				System.out.println("");
				
			}
			for (int i = 0; i < 10; i++) {
				System.out.print("- ");
			}
			System.out.println("");

			System.out.print("���� �ο����� �Է��ϼ��� :");
			num = sc.nextInt();
			sum = sum + num;
			

			for (int i = 0; i < num; i++) {
				System.out.print("�¼��� ���� �����ϼ��� :");
				int row = sc.nextInt();
				System.out.print("�¼��� ���� �����ϼ��� :");
				int col = sc.nextInt();
				System.out.println("");
				
				if (seat[row][col] == 1) {
					System.out.println("�̹� ����� �¼��Դϴ�. �ٽ� �������ּ���");
					i--;
				} else {
					seat[row][col] = 1;
				}
			}

			System.out.print("��� �����Ͻ÷��� 0�� �����Ͻ÷��� 1�� ���� �ּ��� :");
			int check = sc.nextInt();
			if (check == 1) {
				System.out.println("  -------�¼���Ȳ---------");
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
					System.out.print("��"+row+"  ");
					for (int col = 0; col < 10; col++) {
						System.out.print(seat[row][col] + " ");
					}
					System.out.println("");
					
				}
				for (int i = 0; i < 10; i++) {
					System.out.print("- ");
				}
				System.out.println("");
				System.out.println(sum + "���� ���Ű� �Ϸ� ����ϴ�.\n�� �ݾ��� " + (num * 8000) + "�� �Դϴ�.");
				break;
			}
			

		}
	}

}
