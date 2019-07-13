package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		int n1 = 200;
		int n2 = 100;
		
		System.out.println("똑같은지 :"+(n1==n2));
		System.out.println("다른지 :"+(n1!=n2));
		System.out.println("큰지 :"+(n1>n2)); //ctrl + alt + 화살표 아래 : 블록을 잡지 않고 아래로 바로 복사해준다.
											  //alt + 화살표 아래 : 블록을 잡지 않고 아래로 이동시킨다
		//비교 연산자의 결과 값은 항상 boolean의 타입으로 나오게 된다!! 그리고 boolean은 논리형 타입이라고 부른다.
		
		System.out.println("더하기 :"+ (n1+n2));
		System.out.println("빼기 :"+ (n1-n2));
		System.out.println("곱하기 :"+ n1*n2);	//뒤의 연산에 괄호를 넣어주지 않으면 앞의 +처럼 그냥 결합으로 작용해 string이 연속으로 출력된다. 
											//하지만 곱하기 처럼 뒤에 연산의 우선순위가 더 높다면 굳이 괄호로 묶지 않아도 숫자 먼저 계산되고 문자열과 연산이 진행된다.
		
				
	}

}
