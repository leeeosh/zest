package ������;

import java.util.Date;

public class �������ð� {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("���� �ð��� "+hour);
		
		if(hour >= 16) { //�� �������� ����� boolean�� �ش��ϱ⿡ ������ true or false�� ������ �ȴ�.
			System.out.println("���� ���� �� �ð��̿���");
		}
		else {
			System.out.println("���� ���� ���� �ȵǿ�");
		}
		
		
	}

}
