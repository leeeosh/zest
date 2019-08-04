package 상속;

public class 세단 extends Car{
	
	public void winopen() {
		System.out.println("조용히 창문이 열리다");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color+name+"";
	}
	
	

}
