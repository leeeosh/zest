package ���ǹ�;

import java.util.Scanner;

public class ����3 {

	public static void main(String[] args) {
		System.out.println("1.�н�?\n2.�ѽ�?\n3.�Ͻ�?");
		System.out.print("���ϴ� ���� �Է� :");
		Scanner sc = new Scanner(System.in);
		String food = sc.next();
		
		switch(food) {
		case "�н�": System.out.println("�н�������");
					break;
		case "�ѽ�": System.out.println("�ѽ�������");
					break;
		case "�Ͻ�": System.out.println("�Ͻ�������");
					break;
		default : System.out.println("������");
		
		}
		
		
		System.out.println("------------------");
		System.out.print("����� �Է��� �ּ��� :");
		String grade = sc.next();
		
		switch(grade) {
		case "A" : System.out.println("�ֿ���Դϴ�.");
		break;
		case "B" : System.out.println("����Դϴ�.");
		break;
		case "C" : System.out.println("����Դϴ�.");
		break;
		default : System.out.println("����");
		}
		
		
		
		
		
		
	}

}
