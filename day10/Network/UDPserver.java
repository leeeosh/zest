package Network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPserver {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket();	//����� �ְ� ���� ������ ����� ��
		String data = "Java";
				
		InetAddress ip = InetAddress.getByName("192.168.0.200");	//ip��� ������ �� �ڽ��� ip�ּҸ� �ǹ��ϴ� ���� �־� ���� ��
		byte data2[] = data.getBytes();
		DatagramPacket packet = new DatagramPacket(data2,data2.length,ip,5000);	//������, ������ ����, ������ ip, port   �� 4������ ����Ѵ�, �������� �����͸� ��� ���ۿ� ��⿡ ���� ��
							
		socket.send(packet);
		System.out.println("���ۿϷ�");
		
	}

}
