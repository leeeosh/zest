package 연산자;

public class 로그인 {

	public static void main(String[] args) {
		int id = 1000;
		int pw = 2000;
		int num = 1000;
		int num1 = 2000;
		
		if(id == num && pw == num1) {	//엔퍼센트 기호를 두번 사용해 논리연산을 할 수 있다. or은 vertical bar 두개 찍어서 표현 가능하다.
			System.out.println("login sucess!");
		}
		else {
			System.out.println("login fail");
		}
		

	}

}
