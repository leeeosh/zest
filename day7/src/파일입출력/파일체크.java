package ���������;

import java.io.File;

public class ����üũ {

	public static void main(String[] args) {
		File file = new File("D:\\�л���\\LSH\\day07");
		System.out.println(file.exists());  //������ ���� ������ Ȯ���Ѵ�.
		System.out.println(file.isDirectory()); //�������� Ȯ���Ѵ�.
		String list[] = file.list();	//������ ����Ʈ�� �����´�.
		for (String s : list) {
			System.out.println(s);
		}
	}

}
