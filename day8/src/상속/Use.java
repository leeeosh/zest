package 상속;

public class Use {
	public static void main(String[] args) {
		세단 s = new 세단();
		s.color = "RED";
		s.name = "grand";
		s.start();
		s.stop();
		System.out.println(s);
		
		Truck t = new Truck();
		t.color = "blue";
		t.name = "ykii";
		System.out.println(t);
		
		
		
	}

}
