package 파일입출력;

import java.util.ArrayList;

public class 컬렉션테스트2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("박스키");
		list.add("라스키");
		list.remove(0);
		
		System.out.println(list);

	}

}
