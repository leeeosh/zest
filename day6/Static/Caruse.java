package Static;

public class Caruse {

	public static void main(String[] args) {
		
		Car.printcount();
		
		Car c1 = new Car(50);
		Car c2 = new Car(10);
		
		System.out.println(c1.speed +" "+ c2.speed);
		c1.speedup();
		System.out.println(Car.count);
		Car.printcount();
	}

}
