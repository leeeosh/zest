package ����;

public class ��������2 {

	public static void main(String[] args) {
		int num = 10;
		try {
			int i = 10 / 0;
			System.out.println(i);
		} catch (Exception e) {
			//catch�� ������ �߻��� �������� ������ �ȴ�.
			System.out.println("����ó��");
		}	finally {	//���� �߻� ������ ������� ������ �����ϰ� ���� ���� �ؿ� finally�� �ۼ��ϸ� �ȴ�. file.close ���� �� ����Ǿ�� �ϴ� �͵��� ���� ����.
			System.out.println("������");
		}
		

	}

}
