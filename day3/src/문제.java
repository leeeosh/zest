import java.util.Random;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

		Random r = new Random();
		int data = r.nextInt(50);
		int inst = 0;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("0~49 �� ������ ���� �Է�:");
			int num = sc.nextInt();
			inst++;
			if (num == data) {
				System.out.println("@@�����մϴ� ���ڸ� ���߼̽��ϴ�!@@");
				System.out.println("�õ��� Ƚ���� "+inst+"ȸ �Դϴ�. ������ Ƚ���� "+(inst-1)+"ȸ �Դϴ�.");
				break;
			} else if (num > data) {
				System.out.println("���亸�� ū ���� �Է��ϼ̽��ϴ�.");
			} else {
				System.out.println("���亸�� ���� ���� �Է��ϼ̽��ϴ�.");
			}
		}

	}

}
