package ���ǹ�;

import java.util.Scanner;

public class �ֹι�ȣ {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�ֹι�ȣ �� ���ڸ� �Է� :");
			String sn = sc.next();
			char gender = sn.charAt(6);   //�� ��Ʈ�� �߿��� ���ϴ� �κи� �̾ƿ��� ������� .charAt �̴�! ��ġ���� �༭ char �ѱ��ڸ� �����ϴ� ��
										  //��ġ ��(index)�� ������ ���� c���� ���������� 1�����Ͱ� �ƴ� 0������ ��ġ�� �����Ѵ�.
			System.out.println(gender);
			
			switch (gender) {
			case '1':
			case '3':
				System.out.println("���� �Դϴ�.");
				break;
			case '2':
			case '4':
				System.out.println("���� �Դϴ�.");
				break;

			default:
				System.out.println("�ٽ� �Է����ּ���");
				break;
			}
			
	}

}
