import java.util.Random;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {

		Random r = new Random();
		int data = r.nextInt(50);
		int inst = 0;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("0~49 중 생각한 숫자 입력:");
			int num = sc.nextInt();
			inst++;
			if (num == data) {
				System.out.println("@@축하합니다 숫자를 맞추셨습니다!@@");
				System.out.println("시도한 횟수는 "+inst+"회 입니다. 실패한 횟수는 "+(inst-1)+"회 입니다.");
				break;
			} else if (num > data) {
				System.out.println("정답보다 큰 수를 입력하셨습니다.");
			} else {
				System.out.println("정답보다 작은 수를 입력하셨습니다.");
			}
		}

	}

}
