package 파일입출력;

import java.util.Vector;

public class 컬렉션테스트 {

	public static void main(String[] args) {
		
		Vector list = new Vector();
		list.add("나는 스트링");
		list.add(100);
		list.add(11.23);
		list.add(true);
		
		System.out.println(list.size());
		
	}

}
