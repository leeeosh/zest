package ������;

public class ���� {
	//�̷��� ���� �̸��� method�� ���� �� ���� �� �ִ°� overloading�̶�� Ư���̴�.
	public void add() {
		System.out.println("���ϱ� ���");
	}
	
	public void add(int x, int y) {
		System.out.println("�� ���� �� :"+ (x+y));
	}
	
	public void add(String a, String b) {
		System.out.println("�� ������ �� :"+(a + b));
	}
}
