package 조건문;

import java.util.Random;

public class 번호발생기 {

	public static void main(String[] args) {
		Random r = new Random();	//random이라는 class는 말 그대로 random한 값들을 발생시키는 부품이다.
		System.out.println(r.nextInt(3)); 	//얘도 마찬가지로 랜덤한 값 나타낼 때 next를 사용하는데 어떤 범위에서 숫자를 나타낼 지를 int등과 같이 선택한다.
		System.out.println(r.nextInt(3));	//괄호 안에 10이란 숫자를 넣으면 0부터 9까지 숫자를 발생시킨다. 이렇게 범위를 지정할 수 있다.
		System.out.println(r.nextInt(3));	//위에 random()에 숫자를 넣는 것이 아닌 아래에 nextInt에 넣는 것 주의!!!!
		
		
		
		
	}

}
