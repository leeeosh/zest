package ���������;

import java.io.FileWriter;
import java.io.IOException;

public class �������2 {

	public static void main(String[] args) throws Exception  {
		
		FileWriter file = new FileWriter("test2.txt");
		file.write("java"+"\n");
		file.write("spring"+"\n");
		file.write("jsp"+"\n");
		file.write("this is end"+"\n");
		file.close();
		
		
	}

}
