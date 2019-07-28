package Static;

public class Enter {
	String name;
	int age;
	char s;
	static int count;
	
	public Enter(String name, int age, char s) {
		this.name = name;
		this.age = age;
		this.s = s;
		count++;
	}
	
	@Override
	public String toString() {
		return name+" "+age +" "+ s;
	}
	
	
	
}
