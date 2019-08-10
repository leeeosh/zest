package 변수;

public class 변수문제 {
	public static void main(String[] args) {
		byte n =100; // 1바이트
		int i = n;	//4바이트인 int 형에 1바이트에 해당하는 byte를 넣었기에 문제 없이 들어간다
		
		int a = 100;
		byte b = (byte)a;	//byte 같은 경우 127까지 표현이 가능함에도 a가 int형이기에 그냥은 들어가지 않는다. 따라서 강제 형변환을 해줘야 한다.
		
	}
}
