package �迭��ȭ;

public class �ִ밪 {

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
		System.out.println("�ִ밪�� "+max+"�̰� index�� "+inma+"�Դϴ�.");
		System.out.println("�ּҰ��� "+min+"�̰� index�� "+inmi+"�Դϴ�.");
		
		
		
		
		
	}

}
