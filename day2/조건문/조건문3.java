package 조건문;

import java.util.Scanner;

public class 조건문3 {

	public static void main(String[] args) {
		int goal = 1000;
		
		System.out.print("현재 실적을 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int current = sc.nextInt();
		
		if((goal-current) <= 0) {
			System.out.println("실적 달성");
			double bonus = current * 0.2; //두 개를 곱하는데 하나라도 double이면 결과 값은 double이 된다.
			
			System.out.println("보너스를 지급합니다 :"+(int)bonus+"만원"); // double형인데 강제로 int형으로 강제 형변환을 하고 싶으면 앞에 (int) 입력한다.
		}
		else {
			System.out.println("실적 미달성");
		}
			
		
	}

}
