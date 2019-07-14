package 조건문;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		System.out.println("1.짬뽕\n2.자장면\n3.우동");
		System.out.print("입력 :");
		Scanner sc = new Scanner(System.in);
		int food = sc.nextInt();
		
		switch(food) {	//경우를 편하게 선택할 수 있게 해준다. 괄호 안에는 조건 값 즉, 경우를 나타내는 변수를 적어주고 여기엔 int string char 다 가능 그리고 각 case 밑에는 break를 꼭 써줘야한다,
		case 1: System.out.println("음식은 짬뽕");
				break;
		case 2: System.out.println("음식은 자장면");
				break;
		case 3: System.out.println("음식은 우동");
				break;
		default: System.out.println("안먹을래요");
		}
		
		
		
		
		
		
	}

}
