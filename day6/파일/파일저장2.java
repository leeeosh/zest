package 파일;

import java.io.FileWriter;
import java.io.IOException;

public class 파일저장2 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("test.txt");
		file.write("hello java"+"\n");
		file.write("bye java"+"\n");
		file.close();
		
		
	}

}
