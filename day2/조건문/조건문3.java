package ���ǹ�;

import java.util.Scanner;

public class ���ǹ�3 {

	public static void main(String[] args) {
		int goal = 1000;
		
		System.out.print("���� ������ �Է��ϼ��� :");
		Scanner sc = new Scanner(System.in);
		int current = sc.nextInt();
		
		if((goal-current) <= 0) {
			System.out.println("���� �޼�");
			double bonus = current * 0.2; //�� ���� ���ϴµ� �ϳ��� double�̸� ��� ���� double�� �ȴ�.
			
			System.out.println("���ʽ��� �����մϴ� :"+(int)bonus+"����"); // double���ε� ������ int������ ���� ����ȯ�� �ϰ� ������ �տ� (int) �Է��Ѵ�.
		}
		else {
			System.out.println("���� �̴޼�");
		}
			
		
	}

}
