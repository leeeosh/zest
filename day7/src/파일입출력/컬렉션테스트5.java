package 파일입출력;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션테스트5 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("apple", "사과");		
		map.put("melon", "메론");		
		map.put("book", "사과");
		System.out.println(map);
		System.out.println(map.get("apple"));
		
	}

}
