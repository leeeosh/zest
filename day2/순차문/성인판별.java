package ������;

import java.util.Date;
import java.util.Scanner;

public class �����Ǻ� {

	public static void main(String[] args) {
		System.out.print("�¾ �� �Է� :");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt(); //next�� �ϸ� �Է��� ���� string���� �ҷ����°Ű� nextInt�� �Է��� ���� int������ ��ȯ�ؼ� �������ش�.
		
		Date date = new Date();
		int cuyear = date.getYear() + 1900;
		System.out.println("����� ���̴� :" + (cuyear - year + 1));
		
		if((cuyear - year + 1) >= 20) {
			System.out.println("����� �����Դϴ�.");
		}
		else {
			System.out.println("����� �̼����Դϴ�.");
		}
		
		
	}

}
