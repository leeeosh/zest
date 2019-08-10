package 네트워크;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class 서버 {
	public static void main(String[] args) throws Exception {
		int count = 0;
		
		ServerSocket sev = new ServerSocket(5000); //ip주소는 내 주소로 고정이고 port 번호를 입력해주면 되는데 잘 안쓸만한것 입력해주면 된다. 내가 만든 것은 5000번 서버인데 같은 포트번호로 또 만들려고 하면 오류가 난다.
		System.out.println("서버가 시작됨.");
		System.out.println("클라이언트의 접속을 기다리는 중");
		while(true) {	//while문 작성 안해주면 중간에 꺼지기에 무한반복 해놓은것
			Socket socket = sev.accept(); //접속을 허가할수도 불허 할 수 도 있는데 접속을 허가해준 것 
			System.out.println("클라이언트와 연결 성공");
			count++;
			System.out.println(count);
		}
	}
}
