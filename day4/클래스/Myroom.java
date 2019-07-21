package 클래스;

public class Myroom {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.shape = "네모";
		p1.size = 9;
		
		p1.call();
		p1.kakao();
		
		Phone p2 = new Phone();
		p2.shape = "직사각형";
		p2.size = 11;
		p2.kakao();
		
		Puppy d1 = new Puppy();
		d1.age = 10;
		d1.color = "검정색";
		d1.bow();
		d1.run();
				
		Puppy d2 = new Puppy();
		d2.bow();
		d2.run();
		
		
		
		
		
		
		
		
		
	}

}
