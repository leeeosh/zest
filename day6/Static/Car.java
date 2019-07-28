package Static;

public class Car {
	
	int speed;
	static int count;
	public Car(int speed) {
		this.speed = speed;
		count++;
	}
	
	public static void printcount() {
		System.out.println(count);
	}
	
	public void speedup() {
		System.out.println("speed up!");
	}
	

}
