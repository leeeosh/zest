package Static;

public class Day {

	String doing;
	int time;
	String location;
	static int total;

	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		total = total + time;
	}

	@Override
	public String toString() {
		return doing + ", " + time + ", " + location + " " + total;
	}
	
	
	
	

}
