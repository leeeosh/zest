package 자동차경주게임;

public class 자동차경주게임1 {

	public static void main(String[] args) {
		Car1 one = new Car1();
		Car2 two = new Car2();
		Car3 three = new Car3();
		
		one.start();	//스레드로 만들어 놨기 때문에 각각의 메소드들이 동시에 실행되게 한다.
		two.start();
		three.start();
		
		
		
		
		
	}
}