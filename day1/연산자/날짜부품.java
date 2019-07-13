package 연산자;

import java.util.Date;

public class 날짜부품 {

	public static void main(String[] args) {
		Date date = new Date(); /* new 누른 뒤에 ctrl + 스페이스 누르면 자동완성이 뜨는데 그중에 아래꺼에 해당하는 하늘색 얘들 선택해주면 자동으로 자동완성 형태가 만들어진다.
		 							new라는 것은 객체의 인스턴스를 만들어주는 연산자로 원하는 객체를 가져온 뒤 그 객체의 인스턴스를 새롭게 선언해준다. 이후 사용할 때는 인스턴스를 이용해 사용하면 된다.	*/
		int hour = date.getHours(); // get이 보통 데이터를 가져온다는 기능이 많다. 가운데 줄이 쳐져 있는 이유는 너무 오래된 부품이여서 다른 부품을 썼으면 좋겠다고 이클립스가 권고하는 것
		int min = date.getMinutes(); 
		int sec = date.getSeconds(); 
		int year = date.getYear() + 1900; //년도는 밀레니엄 해라고 멸망할꺼라고 예상해서 안만들어 놨기에 제대로 보려면 1900을 더해줘야 제대로 된 년도가 나온다.
		int mon = date.getMonth() +1; //달은 1 적게 나오기 때문에 제대로 보려면 반드시 1을 더해줘야 한다.
		int day = date.getDay();//요일은 0이 월요일이고 하나씩 증가한다.
		System.out.println("현재 시간은 :"+hour +"시"+min+"분"+sec+"초");
		System.out.println("연도"+year+"달"+mon+"요일"+day);
		
		
		
		
		
	}

}
