package Network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPclient2 {

	public static void main(String[] args) throws Exception {

		DatagramSocket socket = new DatagramSocket(6000);
		System.out.println("�����κ��� ���� ���� �غ�");
		byte data[] = new byte[256];
		
		DatagramPacket packet = new DatagramPacket(data, data.length);
		
		socket.receive(packet);
		System.out.println("������ ���� ������ : "+ new String(data));
		System.out.println("������ ���� ������ ���� �Ϸ�");
	}

}
