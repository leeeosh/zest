package Static;

public class Fam {
	String name;
	int height;
	static int wallet = 10000;
	public Fam(String name, int height) {
		this.name = name;
		this.height = height;
		
		
	}
	
	@Override
	public String toString() {
		return name + ", " +height;
	}
	
	

}
