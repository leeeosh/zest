package ����;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ��������3 {

	public static void main(String[] args) throws Exception {
		
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		String age = JOptionPane.showInputDialog("���� �Է�");
		String school = JOptionPane.showInputDialog("�б� �Է�");
		int age2 = Integer.parseInt(age);
		
		FileWriter file = new FileWriter(name+".txt");
		file.write("�� �̸� :"+name+"\n");
		file.write("���� :"+age+"\n");
		file.write("�� �б�:"+school+"\n");
		
		file.close();

		
		
	}

}
