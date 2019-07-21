package 배열심화;

public class 최대값 {

	public static void main(String[] args) {

		int arr[] = {10,50,30,20,100};
		int min = arr[0];
		int max = arr[0];
		int inma = 0;
		int inmi = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=max) {
				max = arr[i];
				inma = i;
						
			}
			if(arr[i]<=min) {
				min = arr[i];
				inmi = i;
						
			}
		}
		System.out.println("최대값은 "+max+"이고 index는 "+inma+"입니다.");
		System.out.println("최소값은 "+min+"이고 index는 "+inmi+"입니다.");
		
		
		
		
		
	}

}
