package 조건문;

import java.util.Date;

public class 조건문2 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		
		if(hour < 11) {
			System.out.println("good morning");
		}
		else if(hour < 15) {
			System.out.println("good afternoon");
		}
		else if(hour < 20) {
			System.out.println("good evening");
		}
		else {
			System.out.println("good night");
		}
		
	}

}
