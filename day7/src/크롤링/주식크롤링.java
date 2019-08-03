package 크롤링;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.JTextArea;

public class 주식크롤링 {
	private JTextField code;
	
	public 주식크롤링() {
		JFrame f = new JFrame();
		f.setSize(309, 500);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("\uBAA8\uB098\uBBF8");
		JTextArea t = new JTextArea();
		b1.setFont(new Font("굴림", Font.PLAIN, 50));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t.setText(" ");
				
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005360").get();
					Elements elist = doc.select("span.blind");  //class를 점으로 표시한다.
					Elements name = doc.select("div.wrap_company h2 a");  //class 표시가 없고 달랑 a 써있는 경우는 해당 그룹 위에꺼 중에 class 써있는 얘를 써준 뒤 보라색 색칠 된 것들을 차례로 띄어쓰기 후 써주면 된다.
					t.append("회사이름 : "+name.get(0).text()+"\n");
					t.append("오늘 " + elist.get(12).text()+"\n");
					t.append("전일대비 " + elist.get(13).text()+"\n");
					t.append(" " + elist.get(14).text()+"\n");
					t.append("고가 " + elist.get(16).text()+"\n");
					t.append("================================"+"\n");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uC0BC\uC131\uC804\uC790");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(" ");
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930").get();
					Elements elist = doc.select("span.blind");  //class를 점으로 표시한다.
					Elements name = doc.select("div.wrap_company h2 a");  //class 표시가 없고 달랑 a 써있는 경우는 해당 그룹 위에꺼 중에 class 써있는 얘를 써준 뒤 보라색 색칠 된 것들을 차례로 띄어쓰기 후 써주면 된다.
					t.append("회사이름 : "+name.get(0).text()+"\n");
					t.append("오늘 " + elist.get(12).text()+"\n");
					t.append("전일대비 " + elist.get(13).text()+"\n");
					t.append(" " + elist.get(14).text()+"\n");
					t.append("고가 " + elist.get(16).text()+"\n");
					t.append("================================"+"\n");
					
				} catch (Exception f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("\uC140\uD2B8\uB9AC\uC628");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(" ");
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
					Elements elist = doc.select("span.blind");  //class를 점으로 표시한다.
					Elements name = doc.select("div.wrap_company h2 a");  //class 표시가 없고 달랑 a 써있는 경우는 해당 그룹 위에꺼 중에 class 써있는 얘를 써준 뒤 보라색 색칠 된 것들을 차례로 띄어쓰기 후 써주면 된다.
					t.append("회사이름 : "+name.get(0).text()+"\n");
					t.append("오늘 " + elist.get(12).text()+"\n");
					t.append("전일대비 " + elist.get(13).text()+"\n");
					t.append(" " + elist.get(14).text()+"\n");
					t.append("고가 " + elist.get(16).text()+"\n");
					t.append("================================"+"\n");
					
				} catch (Exception g) {
					// TODO Auto-generated catch block
					g.printStackTrace();
				}
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(b3);
		
		JLabel lblNewLabel = new JLabel("code : ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 22));
		f.getContentPane().add(lblNewLabel);
		
		code = new JTextField();
		f.getContentPane().add(code);
		code.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\uD06C\uB864\uB9C1 \uC2DC\uC791");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(" ");
				String co = code.getText();
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+co).get();
					Elements elist = doc.select("span.blind");  //class를 점으로 표시한다.
					Elements name = doc.select("div.wrap_company h2 a");  //class 표시가 없고 달랑 a 써있는 경우는 해당 그룹 위에꺼 중에 class 써있는 얘를 써준 뒤 보라색 색칠 된 것들을 차례로 띄어쓰기 후 써주면 된다.
					t.append("회사이름 : "+name.get(0).text()+"\n");
					t.append("오늘 " + elist.get(12).text()+"\n");
					t.append("전일대비 " + elist.get(13).text()+"\n");
					t.append(" " + elist.get(14).text()+"\n");
					t.append("고가 " + elist.get(16).text()+"\n");
					t.append("================================"+"\n");
					
				} catch (Exception r) {
					// TODO Auto-generated catch block
					r.printStackTrace();
				}
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 25));
		f.getContentPane().add(btnNewButton_3);
		
		t.setRows(6);
		t.setColumns(25);
		f.getContentPane().add(t);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		주식크롤링 name = new 주식크롤링();

	}

}
