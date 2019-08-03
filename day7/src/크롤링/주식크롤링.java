package ũ�Ѹ�;

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

public class �ֽ�ũ�Ѹ� {
	private JTextField code;
	
	public �ֽ�ũ�Ѹ�() {
		JFrame f = new JFrame();
		f.setSize(309, 500);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("\uBAA8\uB098\uBBF8");
		JTextArea t = new JTextArea();
		b1.setFont(new Font("����", Font.PLAIN, 50));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t.setText(" ");
				
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005360").get();
					Elements elist = doc.select("span.blind");  //class�� ������ ǥ���Ѵ�.
					Elements name = doc.select("div.wrap_company h2 a");  //class ǥ�ð� ���� �޶� a ���ִ� ���� �ش� �׷� ������ �߿� class ���ִ� �긦 ���� �� ����� ��ĥ �� �͵��� ���ʷ� ���� �� ���ָ� �ȴ�.
					t.append("ȸ���̸� : "+name.get(0).text()+"\n");
					t.append("���� " + elist.get(12).text()+"\n");
					t.append("���ϴ�� " + elist.get(13).text()+"\n");
					t.append(" " + elist.get(14).text()+"\n");
					t.append("�� " + elist.get(16).text()+"\n");
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
					Elements elist = doc.select("span.blind");  //class�� ������ ǥ���Ѵ�.
					Elements name = doc.select("div.wrap_company h2 a");  //class ǥ�ð� ���� �޶� a ���ִ� ���� �ش� �׷� ������ �߿� class ���ִ� �긦 ���� �� ����� ��ĥ �� �͵��� ���ʷ� ���� �� ���ָ� �ȴ�.
					t.append("ȸ���̸� : "+name.get(0).text()+"\n");
					t.append("���� " + elist.get(12).text()+"\n");
					t.append("���ϴ�� " + elist.get(13).text()+"\n");
					t.append(" " + elist.get(14).text()+"\n");
					t.append("�� " + elist.get(16).text()+"\n");
					t.append("================================"+"\n");
					
				} catch (Exception f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		b2.setFont(new Font("����", Font.PLAIN, 50));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("\uC140\uD2B8\uB9AC\uC628");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(" ");
				try {
					Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
					Elements elist = doc.select("span.blind");  //class�� ������ ǥ���Ѵ�.
					Elements name = doc.select("div.wrap_company h2 a");  //class ǥ�ð� ���� �޶� a ���ִ� ���� �ش� �׷� ������ �߿� class ���ִ� �긦 ���� �� ����� ��ĥ �� �͵��� ���ʷ� ���� �� ���ָ� �ȴ�.
					t.append("ȸ���̸� : "+name.get(0).text()+"\n");
					t.append("���� " + elist.get(12).text()+"\n");
					t.append("���ϴ�� " + elist.get(13).text()+"\n");
					t.append(" " + elist.get(14).text()+"\n");
					t.append("�� " + elist.get(16).text()+"\n");
					t.append("================================"+"\n");
					
				} catch (Exception g) {
					// TODO Auto-generated catch block
					g.printStackTrace();
				}
			}
		});
		b3.setFont(new Font("����", Font.PLAIN, 50));
		f.getContentPane().add(b3);
		
		JLabel lblNewLabel = new JLabel("code : ");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 22));
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
					Elements elist = doc.select("span.blind");  //class�� ������ ǥ���Ѵ�.
					Elements name = doc.select("div.wrap_company h2 a");  //class ǥ�ð� ���� �޶� a ���ִ� ���� �ش� �׷� ������ �߿� class ���ִ� �긦 ���� �� ����� ��ĥ �� �͵��� ���ʷ� ���� �� ���ָ� �ȴ�.
					t.append("ȸ���̸� : "+name.get(0).text()+"\n");
					t.append("���� " + elist.get(12).text()+"\n");
					t.append("���ϴ�� " + elist.get(13).text()+"\n");
					t.append(" " + elist.get(14).text()+"\n");
					t.append("�� " + elist.get(16).text()+"\n");
					t.append("================================"+"\n");
					
				} catch (Exception r) {
					// TODO Auto-generated catch block
					r.printStackTrace();
				}
			}
		});
		btnNewButton_3.setFont(new Font("����", Font.PLAIN, 25));
		f.getContentPane().add(btnNewButton_3);
		
		t.setRows(6);
		t.setColumns(25);
		f.getContentPane().add(t);
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		�ֽ�ũ�Ѹ� name = new �ֽ�ũ�Ѹ�();

	}

}
