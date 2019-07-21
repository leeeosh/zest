package 배열심화;

public class ForEachTest {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println("첫번째 배열 값 : " + arr[0]);
		System.out.println("배열의 길이 : " + arr.length);
		System.out.println("맨 마지막 배열 : " + arr[arr.length - 1]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 배열 값은 : " + arr[i]);
		}
		for (int i : arr) {
			System.out.println(i);
		}
		
		String name[] = {"lee","kim","park"};
		for (String s : name) {
			System.out.println(s);
		}
		
		
		
		
		
	}

}
