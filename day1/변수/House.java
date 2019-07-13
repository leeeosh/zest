package 변수;

public class House {

	public static void main(String[] args) {
		
		String color = "초록";
		String number = "8441234";
		int room_num = 302;
		int	floor = 10;
		double size = 50.5;
		char location = '좌';
		boolean cool = true; //boolean 사용할 때 true와 false는 따옴표 사용하지 않는다.
		System.out.println("저의 집에 대한 정보입니다.");
		System.out.println("집 지붕 색깔:"+color);
		System.out.println("집 전화번호 :"+number);
		System.out.println("호실:"+room_num);
		System.out.println("층수:"+floor);
		System.out.println("창문크기:"+size);
		System.out.println("집위치:"+location);
		System.out.println("집이 시원합니까:"+cool);
		
	}

}
