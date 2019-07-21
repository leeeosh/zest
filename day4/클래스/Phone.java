package 클래스;

public class Phone {

	//휴대폰 : class로 만든다.
	//정적 특징인 모양, 사이즈는 변수로 설정한다.
	String shape;
	int size;
	//동적특징 : 전화하다, 카톡하다 -> 메소드를 만들어 젹용하며 c언어의 함수와 동일하다.class의 . 찍어서 접근했던 것들이 메소드에 해당하는 것이다.
	public void call() {
		System.out.println("전화하다.");
	}
	public void kakao() {
		System.out.println("카톡하다.");
	}
	
	
	

}
