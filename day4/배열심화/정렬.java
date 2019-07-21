package 배열심화;


import java.util.Arrays;
import java.util.Random;

public class 정렬 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int n[] = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(10);
		}
		
		Arrays.sort(n);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
				
		
		
	}

}
