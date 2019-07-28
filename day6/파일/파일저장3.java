package 파일;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일저장3 {

	public static void main(String[] args) throws Exception {
		
		String name = JOptionPane.showInputDialog("이름 입력");
		String age = JOptionPane.showInputDialog("나이 입력");
		String school = JOptionPane.showInputDialog("학교 입력");
		int age2 = Integer.parseInt(age);
		
		FileWriter file = new FileWriter(name+".txt");
		file.write("딸 이름 :"+name+"\n");
		file.write("나이 :"+age+"\n");
		file.write("딸 학교:"+school+"\n");
		
		file.close();

		
		
	}

}
