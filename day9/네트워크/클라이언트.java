package 네트워크;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class 클라이언트 {
	
	public static void main(String[] args) throws Exception, IOException {
		Socket soke1t = new Socket("localhost",5000);		//이렇게 입력하면 알아서 현재 이 컴퓨터 ip에 접속을 해준다.
		System.out.println("서버와의 접속 성공!");
	}

}
