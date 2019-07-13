package 변수;

public class Me {

	public static void main(String[] args) {
		// 맨처음 class를 만들 때 alt + v를 누르면 자동으로 main 만들어주는 상자에 체크가 된다.
		byte age; //byte로 선언했기에 -128 ~127까지 저장 가능한 공간이다. -> 변수 선언이자 메모리 공간 확보에 해당
		age = 100;// = : 대입연산자, 할당연산자라고 한다. 대입연산자는 우선순위가 가장 후 순위이기에 우측의 모든 연산을 다 수행한 뒤 마지막에 수행된다.
		System.out.println(age);
		
		int money = 10;
		double weight = 62.3; //8byte의 크기에 해당한다. 
		float eye = 1.5f;//4byte의 크기에 해당하고 얘는 사람과 다르게 컴퓨터는 소수점 뒤에 숫자가 계속 있다고 생각하기에 반드시 f를 붙여줘야한다. 이런 불편함 때문에 보통 double을 많이 사용한다.
		char gender = '남'; //2byte의 크기에 해당하기에 한글도 사용할 수 있는 것, 다른 프로그래밍 언어 같은 경우는 위에서 따로 추가 설정을 해줘야 하는데 얘는 그런게 없어도 되기에 편한 것 
		String name = "이세형";
		boolean lunch = true; //1byte의 크기에 해당하는 변수를 만드는 법은 boolean 입력하면 되고 참과 거짓을 나타내는데 쓰이기에 ture나 false를 사용해주면 된다.
		
		System.out.println("내 나이 :"+age); //더하기 연산자를 사용해 두 데이터를 붙여서 표현할 수 있다. c와는 다르게 콤마나 %d 사용하지 않고 +기호를 사용해 두 데이터를 함께 출력해준다.
		System.out.println("내 돈 :"+money);
		System.out.println("내 몸무게 :"+weight);
		System.out.println("내 시력 :"+eye);
		System.out.println("내 성별:"+gender);
		System.out.println("내 이름:"+name);
		System.out.println("점심 맛있었니?"+lunch);
		

	}

}
