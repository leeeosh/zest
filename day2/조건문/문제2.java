package ���ǹ�;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		System.out.println("1.«��\n2.�����\n3.�쵿");
		System.out.print("�Է� :");
		Scanner sc = new Scanner(System.in);
		int food = sc.nextInt();
		
		switch(food) {	//��츦 ���ϰ� ������ �� �ְ� ���ش�. ��ȣ �ȿ��� ���� �� ��, ��츦 ��Ÿ���� ������ �����ְ� ���⿣ int string char �� ���� �׸��� �� case �ؿ��� break�� �� ������Ѵ�,
		case 1: System.out.println("������ «��");
				break;
		case 2: System.out.println("������ �����");
				break;
		case 3: System.out.println("������ �쵿");
				break;
		default: System.out.println("�ȸ�������");
		}
		
		
		
		
		
		
	}

}
