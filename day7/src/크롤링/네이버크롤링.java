package ũ�Ѹ�;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ� {

	public static void main(String[] args) throws Exception {
		Document doc = Jsoup.connect("https://www.w3schools.com/").get();
		Elements elist = doc.select("h4.w3-margin-top");   // ũ�ҿ��� f12 �������� �ش� �������� ǥ���ϴ� ������ �ܾ���� �¸� ���������� ������ �� �ִ�.
		//System.out.println(elist);	//elements�� �迭�� ���� ������ �ϴ� ���.
		FileWriter file = new FileWriter("w3c.txt");
		for (Element element : elist) {	//element�� ����ִ� ��ҵ��� �ϳ��� �̾ƿ´�.
			System.out.println(element.text());
			file.write(element.text()+"\n");
		}
		file.close();

	}

}
