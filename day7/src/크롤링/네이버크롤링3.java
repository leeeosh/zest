package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링3 {

	public static void main(String[] args) throws Exception {
		
		String code[] = {"005360","005930","068270"};
		
		
		
	
		
		for (int i = 0; i < code.length; i++) {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+code[i]).get();
			Elements elist = doc.select("span.blind");  //class를 점으로 표시한다.
			Elements name = doc.select("div.wrap_company h2 a");  //class 표시가 없고 달랑 a 써있는 경우는 해당 그룹 위에꺼 중에 class 써있는 얘를 써준 뒤 보라색 색칠 된 것들을 차례로 띄어쓰기 후 써주면 된다.
			System.out.println("회사이름 : "+name.get(0).text());
			System.out.println("오늘 " + elist.get(12).text());
			System.out.print("전일대비 " + elist.get(13).text()+"%");
			System.out.println(" " + elist.get(14).text());
			System.out.println("고가 " + elist.get(16).text());
			System.out.println("================================");
			
		}
		
		
		
	}
}
