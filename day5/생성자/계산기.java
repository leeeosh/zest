package 생성자;

public class 계산기 {
	//이렇게 같은 이름의 method를 여러 개 만들 수 있는게 overloading이라는 특성이다.
	public void add() {
		System.out.println("더하기 기능");
	}
	
	public void add(int x, int y) {
		System.out.println("두 수의 합 :"+ (x+y));
	}
	
	public void add(String a, String b) {
		System.out.println("두 문자의 합 :"+(a + b));
	}
}
