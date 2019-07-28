package Static;

public class Dayuse {

	public static void main(String[] args) {
		Day day1 = new Day("java study", 10, "seoul");
		Day day2 = new Day("c++ study", 14, "busan");
		Day day3 = new Day("Phython study", 5, "ulsan");

		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day1);
		
		int total = day1.time + day2.time + day3.time;
		int average = total/ 3;
		
		System.out.println(total + " " + average);
	}

}
