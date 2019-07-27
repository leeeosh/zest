package 생성자;

public class 내폰 {
	String color;
	int size;
	
	public 내폰(String c, int s) {
		color = c;
		size = s;
	}
	
	@Override
	public String toString() {
		return color + size;
	}

}
