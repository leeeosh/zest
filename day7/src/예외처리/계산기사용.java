package ����ó��;

public class ������ {

	public static void main(String[] args) {
		
		���� cal = new ����();
		
		cal.zero();
		try {
			cal.array();
			
		} catch (Exception e) {
			System.out.println("�迭 ���� ����.");
			e.printStackTrace();
		}
		
	}

}
