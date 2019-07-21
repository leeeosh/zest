package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {
		
		int n[] = {1,2,3,4};
		int n1[] = n.clone();
		n[0] = 99;
		System.out.println(n[0]);
		System.out.println(n1[0]);
		
		
		
		
	}

}
