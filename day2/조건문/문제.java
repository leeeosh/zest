package ���ǹ�;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------");
		System.out.print("��� �Է�:");
		int temper = sc.nextInt();
		
		System.out.print("���� ��:");
		String whe = sc.next();  //�Է� ���� �� int���� nextInt�� ����ϰ� �������� next�� ����Ѵ�. character�� �޴� ���� ���� ���⿡ ���ڸ� ������ �������� String���� �Ѵ�.
								 //character�� �޾� �� �� ����.!!
		System.out.print("�Ź� ������ �Է�:");
		int shoes = sc.nextInt();
			
		System.out.println("----------");
		System.out.println("������ "+ temper +"��, ���� �򰡴� "+whe +", �Ź� �������  "+shoes);
		
		System.out.println("@@@@@@@@@@@@@@@");
		
		System.out.print("���Ͻô� ù��° ���� �Է��� �ּ��� :");
		int n1 = sc.nextInt();
		System.out.print("���Ͻô� �ι�° ���� �Է��� �ּ��� :");
		int n2 = sc.nextInt();
		
		if(n1 == n2) {
			System.out.println("�� ���� �����ϴ�.");
		}
		else {
			System.out.println("�� ���� ���� �ʽ��ϴ�.");
		}
		
		System.out.println("@@@@@@@@@@@@@@@");
		
		System.out.print("���� ���� �Է��ϼ��� :");
		int money = sc.nextInt();
		System.out.print("��ǰ�� �Ѿ��� �Է��ϼ��� :");
		int total = sc.nextInt();
		
		System.out.println("������ :"+money+" ��ǰ�� �Ѿ� :"+total+" �ΰ��� :"+(int)(total*0.1)+" �ܵ� :"+(int)(money-total-(total*0.1)));

		
	}

}
