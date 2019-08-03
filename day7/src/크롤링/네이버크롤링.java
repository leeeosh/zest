package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) throws Exception {
		Document doc = Jsoup.connect("https://www.w3schools.com/").get();
		Elements elist = doc.select("h4.w3-margin-top");   // 크롬에서 f12 누른다음 해당 아이콘을 표시하는 문구를 긁어오면 걔만 선택적으로 가져올 수 있다.
		//System.out.println(elist);	//elements가 배열과 같은 역할을 하는 얘다.
		FileWriter file = new FileWriter("w3c.txt");
		for (Element element : elist) {	//element에 들어있는 요소들을 하나씩 뽑아온다.
			System.out.println(element.text());
			file.write(element.text()+"\n");
		}
		file.close();

	}

}
