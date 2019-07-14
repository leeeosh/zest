package 순차문;

import java.util.Scanner;

public class 기본입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("프로그램이름 입력 ");
		String data = sc.next();
		System.out.println("입력값 :"+ data);
		
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("회원가입 정보");
		System.out.println("------------------");
		
		System.out.print("이름: ");
		Scanner input = new Scanner(System.in); /*new라는 명령어를 이용해 class(부품)를 복사해온 뒤 키보드를 이용해 
												     데이터를 입력한다고 정해줘야한다. 이후 input과 점을 이용해 세부적인 next()라는 기능에 접근*/
		String name = input.next();				
		
		System.out.print("아이디: ");
		String id = input.next();
		
		System.out.print("비번: ");
		String pw = input.next();
		
		System.out.print("연락처: ");
		String phone = input.next();
		
		System.out.println("---출력---");
		System.out.println("이름 :"+ name);
		System.out.println("아이디 :"+ id);
		System.out.println("비번 :"+ pw);
		System.out.println("연락처 :"+ phone);
	}

}
