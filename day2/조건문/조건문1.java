package ���ǹ�;

import java.util.Date;

public class ���ǹ�1 {

	public static void main(String[] args) {
		Date date = new Date();	//���� ��Ŭ������ �����ϰ� util ��� �ٸ��Ϳ��� �ڲ� �ҷ����� ctrl+shift+o(����) �� ������ �ڵ� import�� ���ش�.
		int hour = date.getHours();
		
		if(hour < 12) {
			System.out.println("good morning");
		}
		else if(hour < 15) {
			System.out.println("good afternoon");
		}
		else {
			System.out.println("good night");
			
		}
			
	}

}
