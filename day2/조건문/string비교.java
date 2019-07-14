package 조건문;

import java.util.Scanner;

public class string비교 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		
		if(s1.equals(s2)) {  //String은 기본 데이터가 아니기에 단순 비교 연산자로 비교는 불가능하고 .을 찍어 equals라는 명령어를 선택 후 괄호에 비교 대상을 넣어 비교한다.
		System.out.println("두 문자는 동일");
	    }
		else {
			System.out.println("두 문자는 다름");
		}
		
		System.out.print("인생 좌우명 :");
		sc.nextLine(); // nextLine 사용할 때 위에 두문자 입력시 친 엔터가 밑에까지 작용해 life에 입력이 안되기에 엔터를 한번 버리는 nextline을 한번 더 추가해준다.
		String life = sc.nextLine();	//next는 문자열을 받아오는 것이기에 띄어쓰기 전까지 즉! 단어 단위로 불러오지만 nextLine을 사용하면 얘는 한줄을 통째로 읽어온다.
		System.out.println(life);
		
		
		
		
		
		
		
		
		
	}
		

}
