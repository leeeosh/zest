import java.util.Scanner;

public class ����3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mon = 0;
		int sel = 0;
		while (true) {
			System.out.println("-----------------");
			System.out.println("1.���� |2.��� |3.�ܰ� |4.����");
			System.out.println("-----------------");
			System.out.print("����>");
			sel = sc.nextInt();

			if (sel == 1) {
				System.out.print("���ݾ�>");
				int plu = sc.nextInt();
				mon = mon + plu;
			} else if (sel == 2) {
				System.out.print("��ݾ�>");
				int min = sc.nextInt();
				mon = mon - min;
				if(mon <0) {
					System.out.println("�ܰ��� ��ݾ��� �����ϴ�.");
				}
				
			} else if (sel == 3) {
				System.out.print("�ܰ�>" + mon);
			} else {
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

}
