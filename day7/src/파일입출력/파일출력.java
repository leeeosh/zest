package 파일입출력;

import java.io.FileWriter;
import java.io.IOException;

public class 파일출력 {

	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("test.txt");
		file.write("자바" + "\n");
		file.write("스프링" + "\n");
		file.close();
		
		
		
	}

}
