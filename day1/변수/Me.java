package ����;

public class Me {

	public static void main(String[] args) {
		// ��ó�� class�� ���� �� alt + v�� ������ �ڵ����� main ������ִ� ���ڿ� üũ�� �ȴ�.
		byte age; //byte�� �����߱⿡ -128 ~127���� ���� ������ �����̴�. -> ���� �������� �޸� ���� Ȯ���� �ش�
		age = 100;// = : ���Կ�����, �Ҵ翬���ڶ�� �Ѵ�. ���Կ����ڴ� �켱������ ���� �� �����̱⿡ ������ ��� ������ �� ������ �� �������� ����ȴ�.
		System.out.println(age);
		
		int money = 10;
		double weight = 62.3; //8byte�� ũ�⿡ �ش��Ѵ�. 
		float eye = 1.5f;//4byte�� ũ�⿡ �ش��ϰ� ��� ����� �ٸ��� ��ǻ�ʹ� �Ҽ��� �ڿ� ���ڰ� ��� �ִٰ� �����ϱ⿡ �ݵ�� f�� �ٿ�����Ѵ�. �̷� ������ ������ ���� double�� ���� ����Ѵ�.
		char gender = '��'; //2byte�� ũ�⿡ �ش��ϱ⿡ �ѱ۵� ����� �� �ִ� ��, �ٸ� ���α׷��� ��� ���� ���� ������ ���� �߰� ������ ����� �ϴµ� ��� �׷��� ��� �Ǳ⿡ ���� �� 
		String name = "�̼���";
		boolean lunch = true; //1byte�� ũ�⿡ �ش��ϴ� ������ ����� ���� boolean �Է��ϸ� �ǰ� ���� ������ ��Ÿ���µ� ���̱⿡ ture�� false�� ������ָ� �ȴ�.
		
		System.out.println("�� ���� :"+age); //���ϱ� �����ڸ� ����� �� �����͸� �ٿ��� ǥ���� �� �ִ�. c�ʹ� �ٸ��� �޸��� %d ������� �ʰ� +��ȣ�� ����� �� �����͸� �Բ� ������ش�.
		System.out.println("�� �� :"+money);
		System.out.println("�� ������ :"+weight);
		System.out.println("�� �÷� :"+eye);
		System.out.println("�� ����:"+gender);
		System.out.println("�� �̸�:"+name);
		System.out.println("���� ���־���?"+lunch);
		

	}

}
