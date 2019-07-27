package bank;

import java.util.Scanner;

public class 은행 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sel = 0;
		Account p1 = null;
		
		
		while(true) {
			
			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성| 2.계좌목록| 3.예금| 4.출금| 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			sel = sc.nextInt();
			
			
			if(sel == 1) {
				System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");
				
				System.out.print("계좌번호>");
				String no = sc.next();
				
				System.out.print("이름>");
				String name = sc.next();
				
				System.out.print("초기입금액>");
				int total = sc.nextInt();
				p1 = new Account(no, name, total);
				System.out.println("계좌가 생성 되었습니다.");
				
				
			}
			else if(sel == 2) {
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");
				System.out.println(p1);
				
			}
			else if(sel == 3) {
				System.out.println("-------");
				System.out.println("예금");
				System.out.println("-------");
				System.out.print("계좌번호>");
				String a = sc.next();
				System.out.print("예금액>");
				int mon = sc.nextInt();
				p1.total = p1.total + mon;				
				System.out.println("예금이 성공되었습니다.");
			}
			else if(sel == 4) {
				System.out.println("-------");
				System.out.println("출금");
				System.out.println("-------");
				System.out.print("계좌번호>");
				String a = sc.next();
				System.out.print("출금액>");
				int mon = sc.nextInt();
				p1.total = p1.total - mon;				
				System.out.println("출금이 성공되었습니다.");
			}
			else if(sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}			
			else {
				System.out.println("목록에 있는 메뉴를 선택하세요");
			}			
			
			
			
		}

	}

}
