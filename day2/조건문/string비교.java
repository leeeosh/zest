package ���ǹ�;

import java.util.Scanner;

public class string�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		
		if(s1.equals(s2)) {  //String�� �⺻ �����Ͱ� �ƴϱ⿡ �ܼ� �� �����ڷ� �񱳴� �Ұ����ϰ� .�� ��� equals��� ��ɾ ���� �� ��ȣ�� �� ����� �־� ���Ѵ�.
		System.out.println("�� ���ڴ� ����");
	    }
		else {
			System.out.println("�� ���ڴ� �ٸ�");
		}
		
		System.out.print("�λ� �¿�� :");
		sc.nextLine(); // nextLine ����� �� ���� �ι��� �Է½� ģ ���Ͱ� �ؿ����� �ۿ��� life�� �Է��� �ȵǱ⿡ ���͸� �ѹ� ������ nextline�� �ѹ� �� �߰����ش�.
		String life = sc.nextLine();	//next�� ���ڿ��� �޾ƿ��� ���̱⿡ ���� ������ ��! �ܾ� ������ �ҷ������� nextLine�� ����ϸ� ��� ������ ��°�� �о�´�.
		System.out.println(life);
		
		
		
		
		
		
		
		
		
	}
		

}
