package 파일입출력;

import java.io.File;

public class 파일체크 {

	public static void main(String[] args) {
		File file = new File("D:\\학생방\\LSH\\day07");
		System.out.println(file.exists());  //파일의 존재 유무를 확인한다.
		System.out.println(file.isDirectory()); //폴더인지 확인한다.
		String list[] = file.list();	//파일의 리스트를 가져온다.
		for (String s : list) {
			System.out.println(s);
		}
	}

}
