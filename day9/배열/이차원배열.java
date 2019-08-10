package 배열;

public class 이차원배열 {

	public static void main(String[] args) {
		
		int num[][] = new int[2][10];
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println(num.length);
		System.out.println(num[0].length);
		
		
		
		
		
		
	}

}
