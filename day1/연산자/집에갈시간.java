package 연산자;

import java.util.Date;

public class 집에갈시간 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("현재 시간은 "+hour);
		
		if(hour >= 16) { //비교 연산자의 결과는 boolean에 해당하기에 논리값인 true or false가 나오게 된다.
			System.out.println("이제 집에 갈 시간이에요");
		}
		else {
			System.out.println("아직 집에 가면 안되요");
		}
		
		
	}

}
