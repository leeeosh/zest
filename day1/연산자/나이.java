package 연산자;

import java.util.Date;

public class 나이 {

	public static void main(String[] args) {
		int year = 2000;
		
		Date date = new Date(); //new를 사용해 날짜를 나타내주는 Date 라는 부품을 불러온다. 그리고 Date라는 type의 변수를 만들어 저장한다.
		int thisyear = date.getYear()+1900;// date의 많은 기능 중 연도를 불러오는 getYear을 점을 이용해 사용하고 이렇게 불러온 2019라는 숫자를 int형 변수에 저장한다.
		
		int age = thisyear - year +1;
		System.out.println("나의 나이는:"+age);
	}

}
