package bank;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sel = 0;
		Account p1 = null;
		
		
		while(true) {
			
			System.out.println("-------------------------------------");
			System.out.println("1.���»���| 2.���¸��| 3.����| 4.���| 5.����");
			System.out.println("-------------------------------------");
			System.out.print("����>");
			sel = sc.nextInt();
			
			
			if(sel == 1) {
				System.out.println("-------");
				System.out.println("���»���");
				System.out.println("-------");
				
				System.out.print("���¹�ȣ>");
				String no = sc.next();
				
				System.out.print("�̸�>");
				String name = sc.next();
				
				System.out.print("�ʱ��Աݾ�>");
				int total = sc.nextInt();
				p1 = new Account(no, name, total);
				System.out.println("���°� ���� �Ǿ����ϴ�.");
				
				
			}
			else if(sel == 2) {
				System.out.println("-------");
				System.out.println("���¸��");
				System.out.println("-------");
				System.out.println(p1);
				
			}
			else if(sel == 3) {
				System.out.println("-------");
				System.out.println("����");
				System.out.println("-------");
				System.out.print("���¹�ȣ>");
				String a = sc.next();
				System.out.print("���ݾ�>");
				int mon = sc.nextInt();
				p1.total = p1.total + mon;				
				System.out.println("������ �����Ǿ����ϴ�.");
			}
			else if(sel == 4) {
				System.out.println("-------");
				System.out.println("���");
				System.out.println("-------");
				System.out.print("���¹�ȣ>");
				String a = sc.next();
				System.out.print("��ݾ�>");
				int mon = sc.nextInt();
				p1.total = p1.total - mon;				
				System.out.println("����� �����Ǿ����ϴ�.");
			}
			else if(sel == 5) {
				System.out.println("���α׷� ����");
				break;
			}			
			else {
				System.out.println("��Ͽ� �ִ� �޴��� �����ϼ���");
			}			
			
			
			
		}

	}

}
