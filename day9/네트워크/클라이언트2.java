package ��Ʈ��ũ;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ŭ���̾�Ʈ2 {
	
	public static void main(String[] args) throws Exception, IOException {
		Socket soket = new Socket("localhost",5000);		//�̷��� �Է��ϸ� �˾Ƽ� ���� �� ��ǻ�� ip�� ������ ���ش�.
		System.out.println("�������� ���� ����2!");
	}

}
