package 조건문;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		System.out.println("1.분식?\n2.한식?\n3.일식?");
		System.out.print("원하는 음식 입력 :");
		Scanner sc = new Scanner(System.in);
		String food = sc.next();
		
		switch(food) {
		case "분식": System.out.println("분식집으로");
					break;
		case "한식": System.out.println("한식집으로");
					break;
		case "일식": System.out.println("일식집으로");
					break;
		default : System.out.println("집으로");
		
		}
		
		
		System.out.println("------------------");
		System.out.print("등급을 입력해 주세요 :");
		String grade = sc.next();
		
		switch(grade) {
		case "A" : System.out.println("최우수입니다.");
		break;
		case "B" : System.out.println("우수입니다.");
		break;
		case "C" : System.out.println("장려입니다.");
		break;
		default : System.out.println("ㅎㅎ");
		}
		
		
		
		
		
		
	}

}
