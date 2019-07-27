package 생성자;

public class Tv {
//정적특징 -> 변수로 만들어야 한다. member변수라 한다.
	int ch;
	int volume;
	boolean onoff;
	int color;	
	
	public Tv() {
		System.out.println("객체 생성시 내가 자동으로 호출된다.");
		
	}
	public Tv(int c, int v, boolean o) {
		ch = c;
		volume = v;
		onoff = o;
	}
	
//동적특징 -> member method(함수)
	public void poweron() {
		System.out.println("Tv를 켜다.");
	}
	
	public String poweroff() {
		System.out.println("Tv를 끄다.");
		
		return "ok turnoff that Tv.";
	}
	
	@Override // 재 정의라는 뜻이다. 원래의 기능은 tv1 이라고 쓰면 메모리가 할당된 주소가 출력 됬는데 그 주소를 쓸일이 없기에 새로운 기능으로 변경하는 것, 이렇게 tosting을 사용하면 반환하는 것 변경할 수 있다.
		public String toString() {
			return ch + ", "+volume+", "+onoff+", ";
		}
	
	
	
	
}
