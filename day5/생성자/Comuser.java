package 생성자;

import java.util.Scanner;

public class Comuser {

	public static void main(String[] args) {
		String c1;
		Scanner sc = new Scanner(System.in);
		c1 = sc.next();
			
		Computer com1 = new Computer(100, c1);
		Computer com2 = new Computer(1000, "엘지");
		
		System.out.println(com1);
		System.out.println(com2);
		
		
		
	}

}
