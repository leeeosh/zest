package ������;

import java.util.Date;

public class ���� {

	public static void main(String[] args) {
		int year = 2000;
		
		Date date = new Date(); //new�� ����� ��¥�� ��Ÿ���ִ� Date ��� ��ǰ�� �ҷ��´�. �׸��� Date��� type�� ������ ����� �����Ѵ�.
		int thisyear = date.getYear()+1900;// date�� ���� ��� �� ������ �ҷ����� getYear�� ���� �̿��� ����ϰ� �̷��� �ҷ��� 2019��� ���ڸ� int�� ������ �����Ѵ�.
		
		int age = thisyear - year +1;
		System.out.println("���� ���̴�:"+age);
	}

}
