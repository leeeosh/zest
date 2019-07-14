package 조건문;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		System.out.print("본인의 등급을 입력해주세요 :");
		Scanner sc = new Scanner(System.in);
		String gr = sc.next();
		char grade = gr.charAt(0);
		
		switch (grade) {		//조건에 double, float, long 말고는 다 들어갈 수 있다, 소수점은 조건으로 들어갈 수 없다!!!!!
		case 'A':
			System.out.println("최우수 입니다.");
			break;
		case 'B':
			System.out.println("우수 입니다.");
			break;
		case 'C':
			System.out.println("장려 입니다.");
			break;

		default:
			System.out.println("다시 입력해 주세요");
			break;
		}
		
		
	}

}
