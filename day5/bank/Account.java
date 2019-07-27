package bank;

public class Account {
	String no;
	String name;
	int total;
	
	public Account(String no, String name, int total) {
		this.no = no;
		this.name = name;
		this.total = total;
	}
	
	@Override
	public String toString() {
		return no + "  " + name + "  " + total+"¿ø";
	}

}
