package 은행;

import java.util.Scanner;

public class 계좌사용 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계좌명 입력>");
		String acc = sc.next();
		System.out.print("계좌주 입력>");
		String name = sc.next();
		System.out.print("초기 입금액 입력>");
		int mon = sc.nextInt();
		
		계좌 m = new 계좌(acc, name, mon);
		System.out.println(m);
	}

}
