package �ݺ���;

import java.util.Random;

public class fortest {

	public static void main(String[] args) {
		Random r = new Random();
		for(int i = 0; i < 6; i++) {
			int rotto = r.nextInt(60);
			System.out.println("�ζ� ��ȣ =" + rotto);
		}
		
		
		
	}

}
