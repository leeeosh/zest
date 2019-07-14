package 조건문;

import java.util.Date;

public class 조건문1 {

	public static void main(String[] args) {
		Date date = new Date();	//만약 이클립스가 엉뚱하게 util 대신 다른것에서 자꾸 불러오면 ctrl+shift+o(영문) 를 눌러서 자동 import를 해준다.
		int hour = date.getHours();
		
		if(hour < 12) {
			System.out.println("good morning");
		}
		else if(hour < 15) {
			System.out.println("good afternoon");
		}
		else {
			System.out.println("good night");
			
		}
			
	}

}
