package ����;

import java.util.Scanner;

public class ���»�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���¸� �Է�>");
		String acc = sc.next();
		System.out.print("������ �Է�>");
		String name = sc.next();
		System.out.print("�ʱ� �Աݾ� �Է�>");
		int mon = sc.nextInt();
		
		���� m = new ����(acc, name, mon);
		System.out.println(m);
	}

}
