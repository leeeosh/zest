package ������;

import java.util.Scanner;

public class �⺻�Է� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���α׷��̸� �Է� ");
		String data = sc.next();
		System.out.println("�Է°� :"+ data);
		
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("ȸ������ ����");
		System.out.println("------------------");
		
		System.out.print("�̸�: ");
		Scanner input = new Scanner(System.in); /*new��� ��ɾ �̿��� class(��ǰ)�� �����ؿ� �� Ű���带 �̿��� 
												     �����͸� �Է��Ѵٰ� ��������Ѵ�. ���� input�� ���� �̿��� �������� next()��� ��ɿ� ����*/
		String name = input.next();				
		
		System.out.print("���̵�: ");
		String id = input.next();
		
		System.out.print("���: ");
		String pw = input.next();
		
		System.out.print("����ó: ");
		String phone = input.next();
		
		System.out.println("---���---");
		System.out.println("�̸� :"+ name);
		System.out.println("���̵� :"+ id);
		System.out.println("��� :"+ pw);
		System.out.println("����ó :"+ phone);
	}

}
