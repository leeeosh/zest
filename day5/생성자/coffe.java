package ������;

public class coffe {
	int price;
	String field;
	
	public void coffe() {
		System.out.println("Ŀ��");
	}
	public void coffe(int price) {
		this.price = price;
		System.out.println(this.price);
		
	}
	public void coffe(int price, String field) {
		this.price = price;
		this.field = field;
		System.out.println(this.field + this.price);
	}
}
