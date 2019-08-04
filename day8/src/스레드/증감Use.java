package 스레드;

public class 증감Use {

	public static void main(String[] args) {
		증가 j = new 증가();
		감소 d = new 감소();
		
		j.start();
		d.start();
		
		
		
	}

}
