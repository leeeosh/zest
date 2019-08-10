package 변수;

public class 변수문제2 {

	public static void main(String[] args) {
		int num = 10;
		try {
			int i = 10 / 0;
			System.out.println(i);
		} catch (Exception e) {
			//catch는 에러가 발생한 순간에만 실행이 된다.
			System.out.println("에러처리");
		}	finally {	//에러 발생 유무와 상관없이 무조건 실행하고 싶은 것은 밑에 finally를 작성하면 된다. file.close 같이 꼭 실행되어야 하는 것들을 보통 쓴다.
			System.out.println("무조건");
		}
		

	}

}
