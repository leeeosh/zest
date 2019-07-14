package 순차문;

import java.util.Date;
import java.util.Scanner;

public class 성인판별 {

	public static void main(String[] args) {
		System.out.print("태어난 해 입력 :");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt(); //next만 하면 입력한 것을 string으로 불러오는거고 nextInt는 입력한 값을 int형으로 변환해서 가져와준다.
		
		Date date = new Date();
		int cuyear = date.getYear() + 1900;
		System.out.println("당신의 나이는 :" + (cuyear - year + 1));
		
		if((cuyear - year + 1) >= 20) {
			System.out.println("당신은 성인입니다.");
		}
		else {
			System.out.println("당신은 미성년입니다.");
		}
		
		
	}

}
