package 조건문;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------");
		System.out.print("기온 입력:");
		int temper = sc.nextInt();
		
		System.out.print("날씨 평가:");
		String whe = sc.next();  //입력 받을 때 int형은 nextInt를 사용하고 나머지는 next를 사용한다. character를 받는 것은 따로 없기에 숫자를 제외한 나머지는 String으로 한다.
								 //character는 받아 올 수 없다.!!
		System.out.print("신발 사이즈 입력:");
		int shoes = sc.nextInt();
			
		System.out.println("----------");
		System.out.println("오늘은 "+ temper +"도, 나의 평가는 "+whe +", 신발 사이즈는  "+shoes);
		
		System.out.println("@@@@@@@@@@@@@@@");
		
		System.out.print("원하시는 첫번째 수를 입력해 주세요 :");
		int n1 = sc.nextInt();
		System.out.print("원하시는 두번째 수를 입력해 주세요 :");
		int n2 = sc.nextInt();
		
		if(n1 == n2) {
			System.out.println("두 수는 같습니다.");
		}
		else {
			System.out.println("두 수는 같지 않습니다.");
		}
		
		System.out.println("@@@@@@@@@@@@@@@");
		
		System.out.print("받은 돈을 입력하세요 :");
		int money = sc.nextInt();
		System.out.print("상품의 총액을 입력하세요 :");
		int total = sc.nextInt();
		
		System.out.println("받은돈 :"+money+" 상품의 총액 :"+total+" 부가세 :"+(int)(total*0.1)+" 잔돈 :"+(int)(money-total-(total*0.1)));

		
	}

}
