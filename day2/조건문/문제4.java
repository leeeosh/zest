package ���ǹ�;

import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		System.out.print("������ ����� �Է����ּ��� :");
		Scanner sc = new Scanner(System.in);
		String gr = sc.next();
		char grade = gr.charAt(0);
		
		switch (grade) {		//���ǿ� double, float, long ����� �� �� �� �ִ�, �Ҽ����� �������� �� �� ����!!!!!
		case 'A':
			System.out.println("�ֿ�� �Դϴ�.");
			break;
		case 'B':
			System.out.println("��� �Դϴ�.");
			break;
		case 'C':
			System.out.println("��� �Դϴ�.");
			break;

		default:
			System.out.println("�ٽ� �Է��� �ּ���");
			break;
		}
		
		
	}

}
