package ����;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class �������� {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("test2.txt");
		for(int i = 0;i<3;i++) {
			String data = JOptionPane.showInputDialog("�Է����ּ���");
			file.write(data+"\n");
		}
		
		
		file.close();
		
		
	}

}
