package 조건문;

import java.util.Scanner;

public class 주민번호 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("주민번호 중 숫자만 입력 :");
			String sn = sc.next();
			char gender = sn.charAt(6);   //긴 스트링 중에서 원하는 부분만 뽑아오는 기능으로 .charAt 이다! 위치값을 줘서 char 한글자를 추출하는 것
										  //위치 값(index)을 지정할 때는 c언어와 마찬가지로 1번부터가 아닌 0번부터 위치를 지정한다.
			System.out.println(gender);
			
			switch (gender) {
			case '1':
			case '3':
				System.out.println("남자 입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자 입니다.");
				break;

			default:
				System.out.println("다시 입력해주세요");
				break;
			}
			
	}

}
