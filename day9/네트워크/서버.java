package ��Ʈ��ũ;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ���� {
	public static void main(String[] args) throws Exception {
		int count = 0;
		
		ServerSocket sev = new ServerSocket(5000); //ip�ּҴ� �� �ּҷ� �����̰� port ��ȣ�� �Է����ָ� �Ǵµ� �� �Ⱦ����Ѱ� �Է����ָ� �ȴ�. ���� ���� ���� 5000�� �����ε� ���� ��Ʈ��ȣ�� �� ������� �ϸ� ������ ����.
		System.out.println("������ ���۵�.");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� ��");
		while(true) {	//while�� �ۼ� �����ָ� �߰��� �����⿡ ���ѹݺ� �س�����
			Socket socket = sev.accept(); //������ �㰡�Ҽ��� ���� �� �� �� �ִµ� ������ �㰡���� �� 
			System.out.println("Ŭ���̾�Ʈ�� ���� ����");
			count++;
			System.out.println(count);
		}
	}
}
