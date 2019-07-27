package 생성자;

public class Phone {

	String color;
	int size;
	
	//객체 생성시 자동호출
	//생성자 (constructor)
	public Phone(String c, int s) {
		System.out.println("자동 호출");
		
		color = c;
		size = s;
		
		
	}
	public Phone() {
		System.out.println("ㅐㅙㅙ");
	}
	
	public String toString() {
		return color+" " + size;
	}
	
}
