package ����ó��;

public class ���� {

	//�� ������ try catch�� �̿��� ���� ó���� ����.
	public void zero() {
		try {
			System.out.println(4/0);
			
		} catch (Exception e) {
			System.out.println("���� ó��");
		}
		
	}
	//�� ������ throw�� �̿��� array�� �θ� ������ ���ѱ��.
	public void array() throws Exception{
		int arr[] = {1,2};
		arr[2] = 3;
		
	}
}
