package 예외처리;

public class 계산기 {

	//이 에러는 try catch를 이용해 내가 처리해 본다.
	public void zero() {
		try {
			System.out.println(4/0);
			
		} catch (Exception e) {
			System.out.println("에러 처리");
		}
		
	}
	//이 에러는 throw를 이용해 array를 부른 곳으로 떠넘긴다.
	public void array() throws Exception{
		int arr[] = {1,2};
		arr[2] = 3;
		
	}
}
