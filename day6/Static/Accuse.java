package Static;

public class Accuse {

	public static void main(String[] args) {

		Acc p1 = new Acc("청약저축", "김아무개", 500);
		Acc p2 = new Acc("내비상금", "김아무개딸", 30);
		Acc p3 = new Acc("자유적금", "박아무개", 100);
		
	
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("우리 집 전체 예금액은 "+Acc.total+"만원 이에요");
		System.out.println("우리 집 전체 계좌수는 "+Acc.count+"개에요");
	}

}
