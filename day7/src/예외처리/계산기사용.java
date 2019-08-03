package 예외처리;

public class 계산기사용 {

	public static void main(String[] args) {
		
		계산기 cal = new 계산기();
		
		cal.zero();
		try {
			cal.array();
			
		} catch (Exception e) {
			System.out.println("배열 에러 잡음.");
			e.printStackTrace();
		}
		
	}

}
