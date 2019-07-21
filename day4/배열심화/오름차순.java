package 배열심화;

import java.util.Random;

public class 오름차순 {

	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
			System.out.print(arr[i]+",");
			
		}
		System.out.println("");
		
		for (int i = 0; i < (arr.length-1); i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
			System.out.print(arr[i]+",");
			
		}
		
		
		
	}

}
