package Network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPserver {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket();	//통신을 주고 받을 소켓을 만드는 것
		String data = "Java";
				
		InetAddress ip = InetAddress.getByName("192.168.0.200");	//ip라는 변수에 내 자신의 ip주소를 의미하는 것을 넣어 놓은 것
		byte data2[] = data.getBytes();
		DatagramPacket packet = new DatagramPacket(data2,data2.length,ip,5000);	//데이터, 데이터 길이, 상대방의 ip, port   총 4가지를 써야한다, 여러가지 데이터를 담아 전송용 용기에 담은 것
							
		socket.send(packet);
		System.out.println("전송완료");
		
	}

}
