package ������;

public class Tv {
//����Ư¡ -> ������ ������ �Ѵ�. member������ �Ѵ�.
	int ch;
	int volume;
	boolean onoff;
	int color;	
	
	public Tv() {
		System.out.println("��ü ������ ���� �ڵ����� ȣ��ȴ�.");
		
	}
	public Tv(int c, int v, boolean o) {
		ch = c;
		volume = v;
		onoff = o;
	}
	
//����Ư¡ -> member method(�Լ�)
	public void poweron() {
		System.out.println("Tv�� �Ѵ�.");
	}
	
	public String poweroff() {
		System.out.println("Tv�� ����.");
		
		return "ok turnoff that Tv.";
	}
	
	@Override // �� ���Ƕ�� ���̴�. ������ ����� tv1 �̶�� ���� �޸𸮰� �Ҵ�� �ּҰ� ��� ��µ� �� �ּҸ� ������ ���⿡ ���ο� ������� �����ϴ� ��, �̷��� tosting�� ����ϸ� ��ȯ�ϴ� �� ������ �� �ִ�.
		public String toString() {
			return ch + ", "+volume+", "+onoff+", ";
		}
	
	
	
	
}
