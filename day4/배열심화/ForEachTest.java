package �迭��ȭ;

public class ForEachTest {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println("ù��° �迭 �� : " + arr[0]);
		System.out.println("�迭�� ���� : " + arr.length);
		System.out.println("�� ������ �迭 : " + arr[arr.length - 1]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "��° �迭 ���� : " + arr[i]);
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
