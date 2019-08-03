package ũ�Ѹ�;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ�3 {

	public static void main(String[] args) throws Exception {
		
		String code[] = {"005360","005930","068270"};
		
		
		
	
		
		for (int i = 0; i < code.length; i++) {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+code[i]).get();
			Elements elist = doc.select("span.blind");  //class�� ������ ǥ���Ѵ�.
			Elements name = doc.select("div.wrap_company h2 a");  //class ǥ�ð� ���� �޶� a ���ִ� ���� �ش� �׷� ������ �߿� class ���ִ� �긦 ���� �� ����� ��ĥ �� �͵��� ���ʷ� ���� �� ���ָ� �ȴ�.
			System.out.println("ȸ���̸� : "+name.get(0).text());
			System.out.println("���� " + elist.get(12).text());
			System.out.print("���ϴ�� " + elist.get(13).text()+"%");
			System.out.println(" " + elist.get(14).text());
			System.out.println("�� " + elist.get(16).text());
			System.out.println("================================");
			
		}
		
		
		
	}
}
