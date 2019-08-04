package 상속;

public class Truck extends Car{
	
	public void load() {
		System.out.println("짐을 나르다");
		
	}

	@Override
	public String toString() {
		return "Truck [color=" + color + ", name=" + name + "]";
	}
	
	

}
