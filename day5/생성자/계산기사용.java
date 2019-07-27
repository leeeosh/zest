package 생성자;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add();
		cal.add(10, 30);
		cal.add("현정", " 다혜");
	}

}
