package Static;

public class Accuse {

	public static void main(String[] args) {

		Acc p1 = new Acc("û������", "��ƹ���", 500);
		Acc p2 = new Acc("������", "��ƹ�����", 30);
		Acc p3 = new Acc("��������", "�ھƹ���", 100);
		
	
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("�츮 �� ��ü ���ݾ��� "+Acc.total+"���� �̿���");
		System.out.println("�츮 �� ��ü ���¼��� "+Acc.count+"������");
	}

}
