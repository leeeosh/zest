package ������;

public class Phone {

	String color;
	int size;
	
	//��ü ������ �ڵ�ȣ��
	//������ (constructor)
	public Phone(String c, int s) {
		System.out.println("�ڵ� ȣ��");
		
		color = c;
		size = s;
		
		
	}
	public Phone() {
		System.out.println("���ɤ�");
	}
	
	public String toString() {
		return color+" " + size;
	}
	
}
